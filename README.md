<div><p><!-- you can use bootstrap 3 classes to format your instructions --></p>
<div class="alert alert-info">
    <h2>Ficha do "Autocarro"</h2>
    <p><strong>Introdução</strong></p>
    <p>Neste guião vamos trabalhar na implementação do sistema do "Autocarro" apresentado e modelado na aula teórica.</p>
    <p>Todas as classes deverão estar no package <code>pt.ulusofona.lp2.autocarro</code>. Para além disso, cada classe deve estar num ficheiro diferente.</p>
    <p><strong>Nota</strong>: Sempre que necessitar de alterar os atributos, tenha o cuidado de cumprir o princípio do encapsulamento (nomeadamente evitando fazer alterações directas dos valores dos atributos de um objecto de uma classe em código que não pertence à mesma).</p>
    <p><strong>Instruções</strong></p>
    <p><strong>Exercício 1 - Criação do projecto e das classes</strong></p>
    <p><strong>1.1)</strong> Adicione ao projecto as várias classes representadas no modelo UML da aula teórica:</p>
    <ul>
        <li>Classe Autocarro</li>
        <li>Classe Pessoa</li>
        <li>Classe Paragem</li>
        <li>Classe Bilhete - Esta classe não foi modelada na aula teórica, mas vamos implementá-la neste guião.</li>
    </ul>
    <p><strong>1.2)</strong> Implemente os atributos de cada classe do modelo.</p>
    <p><strong>Exercício 2 - Novos atributos</strong></p>
    <p>Adicione os seguintes atributos:</p>
    <ul>
        <li>Na classe Pessoa
            <ul>
                <li>atributo para representar o “nome” da Pessoa;</li>
            </ul>
        </li>
        <li>Na classe Bilhete
            <ul>
                <li>atributo para representar o “número” do Bilhete;</li>
            </ul>
        </li>
    </ul>
    <p>(Os tipos de dados destes novos atributos ficam ao seu critério)</p>
    <p><strong>Exercício 3 - Construtores, getters e setters, toString</strong></p>
    <p><strong>3.1)</strong> Implemente os seguintes construtores:</p>
    <ol>
        <li>Na classe Autocarro
            <ol>
                <li>Autocarro (int capacidade)</li>
            </ol>
        </li>
        <li>Na classe Paragem
            <ol>
                <li>Paragem (String localizacao)</li>
            </ol>
        </li>
        <li>Na classe Pessoa
            <ol>
                <li>Pessoa(... nome)</li>
            </ol>
        </li>
        <li>Na classe Bilhete
            <ol>
                <li>Bilhete(... numero)</li>
            </ol>
        </li>
    </ol>
    <p>(Nota: as … representam os tipos de dados definidos na alínea anterior)</p>
    <p><strong>3.2)</strong>&nbsp;Na classe Pessoa, implemente o seguinte setter:</p>
    <p><code>void setBilhete(Bilhete bilhete)</code></p>
    <p><strong>3.3)</strong> Na classe Autocarro, implemente um método com a seguinte assinatura:</p>
    <p><code>void setPercurso(...)</code></p>
    <p>Este método deverá receber um percurso (ou seja, uma Lista de Paragens) e alterar o objecto autocarro de forma a ter como percurso o valor passado por argumento para este método.</p>
    <p><strong>3.4)</strong>&nbsp;Implemente um método <code>toString()</code> nas classes abaixo indicadas, que devem retornar uma String com a respectiva informação indicada:</p>
    <ul>
        <li>Autocarro
            <ul>
                <li><code>"&lt;capacidade&gt; | &lt;número de passageiros&gt; | &lt;paragem1&gt; » &lt;paragem2&gt; » ... » &lt;paragemN&gt;"</code>
                    <ul>
                        <li>onde &lt;número de passageiros&gt; representa o número de passageiros do autocarro se estiver a transportar algum passageiro, caso contrário representa a String "vazio"</li>
                        <li>caso o autocarro ainda não tenha o percurso definido (ser null ou não ter paragens adicionadas) deverá indicar "s/ percurso" no valor devolvido - exemplo:
                            <ul>
                                <li>"30 | vazio | s/ percurso"</li>
                            </ul>
                        </li>
                    </ul>
                </li>
            </ul>
        </li>
        <li>Pessoa
            <ul>
                <li><code>"&lt;nome&gt; - &lt;bilhete?&gt;</code>
                    <ul>
                        <li>onde &lt;bilhete?&gt; representa o número do bilhete se a Pessoa tiver bilhete, caso contrário representa a String "s/ bilhete"</li>
                    </ul>
                </li>
            </ul>
        </li>
        <li>Paragem
            <ul>
                <li>"&lt;localização&gt;"
                </li>
            </ul>
        </li>
    </ul>
    <p><strong>Exercício 4 - Métodos de instância</strong></p>
    <p><strong>4.1)</strong> Na classe Autocarro, defina o seguinte método:</p>
    <p><code>void adicionarParagem(Paragem paragem)</code></p>
    <p>Este método deverá adicionar ao atributo “percurso” do Autocarro a nova Paragem. A nova Paragem deve ser adicionada ao final da Lista de Paragens.</p>
    <p>Nota: tenha o cuidado de garantir que a lista de paragens está devidamente inicializada antes de adicionar objectos à mesma.</p>
    <p><strong>4.2)</strong> Na classe Autocarro, implemente um método com a seguinte assinatura:</p>
    <p><code>String imprimirPercurso()</code></p>
    <p>Este método deverá criar uma String que contenha as localizações das várias Paragens onde o autocarro pára. Deve usar a seguinte sintaxe:</p>
    <p><code>“&lt;Localização Paragem 1&gt; » &lt;Loc. Paragem 2&gt; » .. » &lt;Loc. Paragem n&gt;”</code></p>
    <p>Se não houver percurso deve devolver a String vazia</p>
    <p><strong>Exercício 5 - Criação de objectos</strong></p>
    <p>Na classe principal do seu programa deverá ter uma função main(...).</p>
    <p><strong>5.1)</strong> Adicione à classe <code>Main</code> a função&nbsp;</p>
    <p><code>static Autocarro autocarroUrbano()</code></p>
    <p>Esta função tem de devolver um objecto da classe Autocarro. Este autocarro deve ter capacidade para 30 pessoas e deve passar em 3 paragens.</p>
    <p>As paragens devem ser localizadas em “Rossio”, “Entrecampos” e “Campo Grande” (por esta ordem).</p>
    <p>Nota: para definir este percurso deve invocar o método adicionarParagem() tantas vezes quantas necessárias de forma a definir o percurso indicado.</p>
    <p><strong>5.2)</strong> Adicione à classe Main a função&nbsp;</p>
    <p><code>static Autocarro autocarroSuburbano()</code></p>
    <p>Esta função tem de devolver um objecto da classe Autocarro. Este autocarro deve ter capacidade para 27 pessoas.</p>
    <p>O percurso deste Autocarro deve ser definido invocando o método de instância setPercurso().</p>
    <p>Para o fazer, deve criar um ArrayList&lt;Paragem&gt; com a paragens nas seguintes localizações: “Rossio”, “Entrecampos”, “Campo Grande”, “Benfica”. De seguida, invoque o método setPercurso() e passe para o mesmo este ArrayList.</p>
    <p><strong>5.3)</strong> Adicione à classe Main a função&nbsp;</p>
    <p><code>static ArrayList&lt;X&gt; doisAutocarros()</code></p>
    <p>Esta função deve devolver um ArrayList com 2 objectos Autocarro que tenham as mesmas características dos que forem devolvidos pelas funções autocarroUrbano() e autocarroSuburbano().</p>
    <p>A ordem esperada é a do autocarro urbano seguido do autocarro suburbano.</p>
    <p>Nota: X representa um tipo de dados.</p>
    <p><strong>5.4)</strong> Adicione à classe Main a função</p>
    <p><code>static HashMap&lt;X, Y&gt; autocarrosPorID()</code></p>
    <p>Esta função deve devolver um HashMap onde a chave é o ID de um Autocarro e o valor é um objecto Autocarro. Adicione ao HashMap as duas entradas que se seguem:</p>
    <ul>
        <li>Entrada 1
            <ul>
                <li>ID: 100</li>
                <li>Autocarro: o objecto devolvido pela função autocarroUrbano()</li>
            </ul>
        </li>
        <li>Entrada 2
            <ul>
                <li>ID: 200</li>
                <li>Autocarro: o objecto devolvido pela função autocarroSuburbano()</li>
            </ul>
        </li>
    </ul>
    <p>Nota: X e Y representam tipos de dados.</p>
    <p><strong>Exercício 6 - Métodos (comportamentos)</strong></p>
    <p><strong>6.1)</strong> Implemente os métodos em falta:</p>
    <ol>
        <li>1. Na classe Autocarro:
            <ol>
                <li><code>boolean entrar(Pessoa pessoa)</code></li>
                <li><code>boolean passaNaParagem(String localizacao)</code></li>
            </ol>
        </li>
        <li>Na classe Pessoa:
            <ol>
                <li><code>boolean temBilhete()</code></li>
            </ol>
        </li>
    </ol>
    <p>&nbsp;<strong>6.2)</strong> Na função main(), teste os métodos implementados no passo anterior.</p>
    <p>(Para o fazer, poderá ser necessária a criação de novos objectos).</p>
    <p><strong>Exercício 7 - Mais métodos (comportamentos)</strong></p>
    <p><strong>7.1)</strong> Implemente na classe Autocarro um método com as seguinte assinatura:</p>
    <p><code>boolean mesmoPercurso(Autocarro outro)</code></p>
    <p>Este método deve retornar true se o autocarro da própria instância (o “this”) passa exactamente nas mesmas paragens, pela mesma ordem, que o autocarro passado no argumento “outro”.</p>
    <p>Dois objectos Paragem serão considerados o mesmo caso tenham a mesma localização.</p>
    <p><strong>7.2)</strong> Implemente na classe Autocarro um método com a seguinte assinatura:</p>
    <p><code>boolean temLigacao(Autocarro outro)</code></p>
    <p>Este método deve retornar true se o autocarro da própria instância (o “this”) terminar na mesma paragem onde o autocarro passado no argumento “outro” começa.</p>
    <p>Dois objectos Paragem serão considerados o mesmo caso tenham a mesma localização.</p>
    <p><strong>7.3)</strong> Implemente na classe Autocarro um método com a seguinte assinatura:</p>
    <p><code>boolean temParagensComuns(Autocarro outro)</code></p>
    <p>Este método deve retornar true se o autocarro da própria instância (o “this”) e o autocarro passado por argumento (o “outro”) tiverem pelo menos uma paragem em comum.</p>
    <p>Dois objectos Paragem serão considerados o mesmo caso tenham a mesma localização.</p>
    <p><strong>7.4)</strong> Implemente na classe Autocarro um método com a seguinte assinatura:</p>
    <p><code>HashSet&lt;Paragem&gt; paragensComuns(Autocarro outro)</code></p>
    <p>Este método deve retornar um conjunto (HashSet) que tenha as estações que existem quer no autocarros da própria instância (o “this”), quer no autocarro passado por argumento (o “outro”).</p>
    <p>Dois objectos Paragem serão considerados o mesmo caso tenham a mesma localização.</p>
    <p><strong>Notas</strong></p>
    <p>Tenha o cuidado de respeitar os nomes, tipos de dados e formatos indicados.</p>
    <p>Tenha o cuidado de respeitar o princípio de encapsulamento.</p>
</div></div>
