var service = require('./servidor');
var express = require ('express')
var vm = this;
var app = service(3000);

var amigos = [
    {id: 1, nome: "Bruno", telefone: "9999-2222"},
    {id: 2, nome: "Sandra", telefone: "9999-3333"},
    {id: 3, nome: "Mariana", telefone: "9999-9999"}
];


app.interceptor(function (req, res, next) {
    res.setHeader('Access-Control-Allow-Origin', '*');
    res.setHeader('Access-Control-Allow-Headers', 'Content-Type, Authorization');
    next();
});

app.interceptor(function (req, res, next) {
    res.setHeader('Content-Type', 'application/json;charset=UTF-8');
    next();
});

app.get('/amigos', function (req, res) {
    res.write(JSON.stringify(amigos));
    res.end();
});

app.post('/amigos', function (req, res) {
    var amigo = req.body;
    amigos.push(JSON.parse(amigo));
    res.end();
  });
  
  app.post('/file', function (req, res) {
    console.log(req.body);
    res.end();
  });
  
  app.options('/file', function (req, res) {
    res.end();
  });
  
  app.options('/amigos', function (req, res) {
    res.end();
  });
