<Location /svn>
	DAV svn
	SVNParentPath /svn
	AuthType basic
	AuthName "Subversion Repository"
	AuthUserFile /etc/subversion/passwd 
	Require valid-user
</Location>

