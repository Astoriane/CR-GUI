import cookielib, urllib2, urllib, fileinput, sys, re

def login(username, password):
	opener = urllib2.build_opener(urllib2.HTTPCookieProcessor(cookie_jar))
	opener.addheaders = [('Referer', 'https://www.crunchyroll.com/login'),
						('User-Agent', 'Mozilla/5.0 (Windows NT 6.1; rv:26.0) Gecko/20100101 Firefox/26.0'),
						('Content-Type', 'application/x-www-form-urlencoded')]

	url = 'https://www.crunchyroll.com/?a=formhandler'
	data = {'formname' : 'RpcApiUser_Login', 'fail_url' : 'http://www.crunchyroll.com/login', 'name' : username, 'password' : password}
	req = urllib2.Request(url, urllib.urlencode(data))
	res = opener.open(req)


try:
	with open('config/cookies.txt'): pass
except IOError:
	cookie_jar = cookielib.MozillaCookieJar('config/cookies.txt')
	cookie_jar.save()
if 2 < len(sys.argv):
	if 3 < len(sys.argv):
		if sys.argv[3] == 'no':
			print 'No cookies created.'
			sys.exit()
	else:
		cookie_jar = cookielib.MozillaCookieJar('config/cookies.txt')
		cookie_jar.load()
		username = sys.argv[1]
		password = sys.argv[2]
		login(username, password)
		opener = urllib2.build_opener(urllib2.HTTPCookieProcessor(cookie_jar))
		opener.addheaders = [('User-Agent', 'Mozilla/5.0 (Windows NT 6.1; rv:26.0) Gecko/20100101 Firefox/26.0'),
					('Connection', 'keep-alive')]
		url = 'http://www.crunchyroll.com/'
		req = opener.open(url)
		site = req.read()

	if re.search(username + '(?i)', site):
		print ' '
		print 'Login successful. Cookies saved to: '  + "'config/cookies.txt'"
		cookie_jar.save()

		for line in fileinput.input('config/cookies.txt', inplace=1):
			line = line.strip()
			if not 'c_visitor' in line:
				print line
	else:
		print ' '
		print 'Login failed. Script shutting down.'
		sys.exit()
