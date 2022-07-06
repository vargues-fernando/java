git config --local branch.master.github-pr-owner-number [36ms]
git remote add estudo https://github.com/vargues-fernando/estudo.git [62ms]
git status -z -uall [5514ms]
git symbolic-ref --short HEAD [2ms]
git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) refs/heads/master refs/remotes/master [2ms]
git remote --verbose [19ms]
git for-each-ref --sort -committerdate --format %(refname) %(objectname) %(*objectname) [37ms]
git config --get commit.template [5ms]
git config --local branch.master.github-pr-owner-number [2ms]
git fetch estudo [19987ms]

Para armazenar PAT como credencial no cache
git config --global credential.helper cache



