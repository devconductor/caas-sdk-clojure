(ns pier-sdk-clojure.api.debito-recorrente
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn listar-using-get16-with-http-info
  "Lista os débitos recorrentes de uma Conta
  A entidade Débito Recorrente trata dos registros contratados por um determinado cliente (idConta) onde a cobrança dele se dá de forma contínua, consistindo em uma “assinatura” ou pagamento de mensalidades. Isso significa que, enquanto o serviço continuar a ser prestado, o cliente deverá continuar realizando os pagamentos. A determinação de quanto tempo essa relação irá durar é feita em contrato. Na maioria das vezes, existe um período mínimo e, caso o serviço seja cancelado ou o pagamento não seja realizado, o status do Débito Recorrente terá a FlagAtivo com valor false. Assim, este método lista todas as operações de Débitos Recorrentes que um determinado idConta já contratou, esteja ele ativo ou não."
  ([id-conta ] (listar-using-get16-with-http-info id-conta nil))
  ([id-conta {:keys [id-tipo-debito-recorrente sort page limit data-hora-inicio data-hora-fim ativo data-hora-ultimo-pagamento ]}]
   (call-api "/api/debitos-recorrentes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"idConta" id-conta "idTipoDebitoRecorrente" id-tipo-debito-recorrente "sort" (with-collection-format sort :multi) "page" page "limit" limit "dataHoraInicio" data-hora-inicio "dataHoraFim" data-hora-fim "ativo" ativo "dataHoraUltimoPagamento" data-hora-ultimo-pagamento }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get16
  "Lista os débitos recorrentes de uma Conta
  A entidade Débito Recorrente trata dos registros contratados por um determinado cliente (idConta) onde a cobrança dele se dá de forma contínua, consistindo em uma “assinatura” ou pagamento de mensalidades. Isso significa que, enquanto o serviço continuar a ser prestado, o cliente deverá continuar realizando os pagamentos. A determinação de quanto tempo essa relação irá durar é feita em contrato. Na maioria das vezes, existe um período mínimo e, caso o serviço seja cancelado ou o pagamento não seja realizado, o status do Débito Recorrente terá a FlagAtivo com valor false. Assim, este método lista todas as operações de Débitos Recorrentes que um determinado idConta já contratou, esteja ele ativo ou não."
  ([id-conta ] (listar-using-get16 id-conta nil))
  ([id-conta optional-params]
   (:data (listar-using-get16-with-http-info id-conta optional-params))))

(defn listar-using-get43-with-http-info
  "Listar Tipos Debitos Recorrentes
  Para os emissores que utilizam a entidade Debitos Recorrentes precisam previamente solicitar a Conductor o cadastro de quais Tipos eles poderão comercializar. Por isso, este recurso tem como objetivo apresentar todos os Tipos de Débitos Recorrentes que estão cadastrados para um determinado Emissor, independente do status dele."
  ([] (listar-using-get43-with-http-info nil))
  ([{:keys [sort page limit id descricao valor flag-ativo ]}]
   (call-api "/api/tipos-debitos-recorrentes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "id" id "descricao" descricao "valor" valor "flagAtivo" flag-ativo }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get43
  "Listar Tipos Debitos Recorrentes
  Para os emissores que utilizam a entidade Debitos Recorrentes precisam previamente solicitar a Conductor o cadastro de quais Tipos eles poderão comercializar. Por isso, este recurso tem como objetivo apresentar todos os Tipos de Débitos Recorrentes que estão cadastrados para um determinado Emissor, independente do status dele."
  ([] (listar-using-get43 nil))
  ([optional-params]
   (:data (listar-using-get43-with-http-info optional-params))))
