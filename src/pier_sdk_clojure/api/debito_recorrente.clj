(ns pier-sdk-clojure.api.debito-recorrente
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn listar-using-get12-with-http-info
  "Lista os dÃ©bitos recorrentes de uma Conta
  A entidade DÃ©bito Recorrente trata dos registros contratados por um determinado cliente (idConta) onde a cobranÃ§a dele se dÃ¡ de forma contÃ­nua, consistindo em uma âassinaturaâ ou pagamento de mensalidades. Isso significa que, enquanto o serviÃ§o continuar a ser prestado, o cliente deverÃ¡ continuar realizando os pagamentos. A determinaÃ§Ã£o de quanto tempo essa relaÃ§Ã£o irÃ¡ durar Ã© feita em contrato. Na maioria das vezes, existe um perÃ­odo mÃ­nimo e, caso o serviÃ§o seja cancelado ou o pagamento nÃ£o seja realizado, o status do DÃ©bito Recorrente terÃ¡ a FlagAtivo com valor false. Assim, este mÃ©todo lista todas as operaÃ§Ãµes de DÃ©bitos Recorrentes que um determinado idConta jÃ¡ contratou, esteja ele ativo ou nÃ£o."
  ([id-conta ] (listar-using-get12-with-http-info id-conta nil))
  ([id-conta {:keys [id-tipo-debito-recorrente sort page limit data-hora-inicio data-hora-fim ativo data-hora-ultimo-pagamento ]}]
   (call-api "/api/debitos-recorrentes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"idConta" id-conta "idTipoDebitoRecorrente" id-tipo-debito-recorrente "sort" (with-collection-format sort :multi) "page" page "limit" limit "dataHoraInicio" data-hora-inicio "dataHoraFim" data-hora-fim "ativo" ativo "dataHoraUltimoPagamento" data-hora-ultimo-pagamento }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get12
  "Lista os dÃ©bitos recorrentes de uma Conta
  A entidade DÃ©bito Recorrente trata dos registros contratados por um determinado cliente (idConta) onde a cobranÃ§a dele se dÃ¡ de forma contÃ­nua, consistindo em uma âassinaturaâ ou pagamento de mensalidades. Isso significa que, enquanto o serviÃ§o continuar a ser prestado, o cliente deverÃ¡ continuar realizando os pagamentos. A determinaÃ§Ã£o de quanto tempo essa relaÃ§Ã£o irÃ¡ durar Ã© feita em contrato. Na maioria das vezes, existe um perÃ­odo mÃ­nimo e, caso o serviÃ§o seja cancelado ou o pagamento nÃ£o seja realizado, o status do DÃ©bito Recorrente terÃ¡ a FlagAtivo com valor false. Assim, este mÃ©todo lista todas as operaÃ§Ãµes de DÃ©bitos Recorrentes que um determinado idConta jÃ¡ contratou, esteja ele ativo ou nÃ£o."
  ([id-conta ] (listar-using-get12 id-conta nil))
  ([id-conta optional-params]
   (:data (listar-using-get12-with-http-info id-conta optional-params))))

(defn listar-using-get36-with-http-info
  "Listar Tipos Debitos Recorrentes
  Para os emissores que utilizam a entidade Debitos Recorrentes precisam previamente solicitar a Conductor o cadastro de quais Tipos eles poderÃ£o comercializar. Por isso, este recurso tem como objetivo apresentar todos os Tipos de DÃ©bitos Recorrentes que estÃ£o cadastrados para um determinado Emissor, independente do status dele."
  ([] (listar-using-get36-with-http-info nil))
  ([{:keys [sort page limit id descricao valor flag-ativo ]}]
   (call-api "/api/tipos-debitos-recorrentes" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "id" id "descricao" descricao "valor" valor "flagAtivo" flag-ativo }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get36
  "Listar Tipos Debitos Recorrentes
  Para os emissores que utilizam a entidade Debitos Recorrentes precisam previamente solicitar a Conductor o cadastro de quais Tipos eles poderÃ£o comercializar. Por isso, este recurso tem como objetivo apresentar todos os Tipos de DÃ©bitos Recorrentes que estÃ£o cadastrados para um determinado Emissor, independente do status dele."
  ([] (listar-using-get36 nil))
  ([optional-params]
   (:data (listar-using-get36-with-http-info optional-params))))
