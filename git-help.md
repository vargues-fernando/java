[2022-07-05T12:49:52.630Z] > git config --local branch.master.github-pr-owner-number [36ms]
[2022-07-05T12:50:04.815Z] > git remote add estudo https://github.com/vargues-fernando/estudo.git [62ms]
[2022-07-05T12:50:10.447Z] > git status -z -uall [5514ms]
[2022-07-05T12:50:10.465Z] > git symbolic-ref --short HEAD [2ms]
[2022-07-05T12:50:10.482Z] > git for-each-ref --format=%(refname)%00%(upstream:short)%00%(objectname)%00%(upstream:track)%00%(upstream:remotename)%00%(upstream:remoteref) refs/heads/master refs/remotes/master [2ms]
[2022-07-05T12:50:10.536Z] > git remote --verbose [19ms]
[2022-07-05T12:50:10.536Z] > git for-each-ref --sort -committerdate --format %(refname) %(objectname) %(*objectname) [37ms]
[2022-07-05T12:50:10.572Z] > git config --get commit.template [5ms]
[2022-07-05T12:50:10.948Z] > git config --local branch.master.github-pr-owner-number [2ms]
[2022-07-05T12:50:30.581Z] > git fetch estudo [19987ms]



