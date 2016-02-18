'use strict';

App.controller('RegistrationController', ['$scope', 'UserService', function($scope, UserService){
    var self = this;
    self.user={/*id_client:null,*/ name_firm:'',first_name:'',last_name:'',email_user:'',address_user:'',user_password:''};



    self.createClient = function(user){
        UserService.create(user)
            .then(
            function(errResponce){
                console.error('Error with create client');
            }
        );
    };
    //self.fetchAllClients();
    self.submit = function() {
        //if(self.client.id_client === null){
            console.log('Saving New client', self.user);
            self.createClient(self.user);
        //}
        self.reset();
    };
    self.reset = function(){
        self.user = {/*id_client:null,*/ name_firm:'',first_name:'',last_name:'',email_user:'',address_user:'',user_password:''};
        $scope.registerForm.$setPristine(); //reset Form
    };
}]);