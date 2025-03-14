% Fatos (base de conhecimento)
pai(idalencio, valdemar).
pai(valdemar, luciano).
pai(valdemar, marcio).
pai(luciano, luigi).
pai(luciano, luisa).
pai(luciano, lucas).

% Regras para definir relações familiares
avo(X, Y) :- pai(X, Z), pai(Z, Y).  % X é avô de Y se X é pai de Z e Z é pai de Y.
filho(X, Y) :- pai(Y, X).           % X é filho de Y se Y é pai de X.
irmao(X, Y) :- pai(Z, X), pai(Z, Y), X \= Y. % X é irmão de Y se Z é pai de X e Z é pai de Y
