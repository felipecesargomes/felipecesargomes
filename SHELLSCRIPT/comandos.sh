apt-get update
curl -s "https://get.sdkman.io" | bash
source "$HOME/.sdkman/bin/sdkman-init.sh"
apt install curl
sdk install java 14.0.1-open
sdk install java 11.0.7-open
apt-get install git-all
sudo snap install postman
cd /home/felipe
sudo apt-get install default-jre

if uname -m
then
echo 'Windows é de 64 bits - Instalando Visual Code Studio'
sudo sh -c 'echo "deb [arch=amd64] https://packages.microsoft.com/repos/vscode stable main" > /etc/apt/sources.list.d/vscode.list'
curl https://packages.microsoft.com/keys/microsoft.asc | gpg --dearmor > microsoft.gpg
sudo mv microsoft.gpg /etc/apt/trusted.gpg.d/microsoft.gpg
sudo apt-get update
sudo apt-get install code
else
echo 'Windows de 32 bits - não instalado'
fi

wget http://eclipse.c3sl.ufpr.br/technology/epp/downloads/release/2020-03/R/eclipse-jee-2020-03-R-incubation-linux-gtk-x86_64.tar.gz
var=$(pwd)
sudo apt install mysql-server
cd /opt
sudo tar -xvzf $var/eclipse-jee-2020-03-R-incubation-linux-gtk-x86_64.tar.gz