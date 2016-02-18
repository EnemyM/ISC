'use strict';

App.factory('UserService',['$http', '$q', function($http,$q){
    return{

        create: function(user){
            return $http.post('http://localhost:8080/registration/', user)
                .then(
                //function(response){
                //    return response.data;
                //},
                function(errResponse){
                    console.error('Error with create client');
                    return $q.reject(errResponse);
                }
            );
        }
    };
}]);
