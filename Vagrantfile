Vagrant.configure("2") do |config|
    config.vm.box = "ubuntu/trusty64"
    config.vm.box_url = "http://files.vagrantup.com/precise32.box"

    config.vm.network "forwarded_port", guest: 5432, host: 5432

    config.vm.provision "ansible" do |ansible|
        ansible.playbook = "ansible/playbook.yml"
    end
end

