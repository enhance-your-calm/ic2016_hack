import java.util.*;

/**
 * Created by Smile on 17.10.15.
 */
public class HardcodeDictionary extends DictionaryOfWords {

        int[] scoreData=new int[]{1,2,3,4,5,1,2,3,4,5,-1,-2,-3,-4,-5,-1,-2,-3,-4,-5};

        String[] negAng5 = new String[]{"bastard","bastards","bitch","bitches","cock","cocksucker","cocksuckers","cunt",
                "motherfucker","motherfucking","niggas","nigger","prick","slut","son-of-a-bitch","twat"};
        String[] negRus5 = new String[]{"ублюдок","сволочь","ублюдки","сволочи","сука","суки","член","членосос","членососы","хуй","хуесосы","пизда","вагина","нигер","шлюха","проститутка","пиздабол"};

        String[] negAng4 = new String[]{"ass","assfucking","asshole","bullshit","catastrophic","damn","damned","damnit","dick",
                "dickhead","fraud","frauds","fraudster","fraudsters","fraudulence","fraudulent","fuck","fucked",
                "fucker","fuckers","fuckface","fuckhead","fucking","fucktard","fuked","fuking","hell","jackass",
                "jackasses","piss","pissed","rape","rapist","scumbag","shit","shithead","shrew","torture","tortured",
                "tortures","torturing","whore","wtf"};
        String[] negRus4 = new String[]{"жопа","ебаный","мудак","фигня","катастрофический","проклятие","проклятый","залупа","мошенник","мошенники","мошенничество","обман","наебалово","мошеннический","ебать","ебаный",
                "ебонат","ебонаты","ебаный,","ебаный","ебанутый","ад","черт","придурок",
                "придурки","ссать","ссаный","изнасиловать","насильник","отморозок","падонок","дерьмо","сраный","мегера","мучение","измученный",
                "пытки","пытать"};

        String[] negAng3 = new String[]{"abhor","abhorred","abhorrent","abhors","abuse","abused","abuses","abusive",
                "acrimonious","agonise","agonised","agonises","agonising","agonize","agonized","agonizes",
                "agonizing","anger","angers","angry","anguish","anguished","apathetic","apathy","apeshit",
                "arrested","assassination","assassinations","awful","bad","badass","badly","bankrupt","bankster",
                "betray","betrayal","betrayed","betraying","betrays","bloody","boring","brainwashing","bribe",
                "catastrophe","charged","charmless","chastise","chastised","chastises","chastising","cheat",
                "cheated","cheater","cheaters","cheats","colluding","conspiracy","cover-up","crap","crime",
                "criminal","criminals","crisis","cruel","cruelty","damage","damages","dead","deceit","deceitful",
                "deceive","deceived","deceives","deceiving","deception","defect","defects","despair","despairing",
                "despairs","desperate","desperately","despondent","destroy","destroyed","destroying","destroys",
                "destruction","destructive","die","died","dipshit","dire","direful","disastrous","disgust",
                "disgusted","disgusting","distrust","distrustful","doesnotwork","douche","douchebag","dreadful",
                "dumb","dumbass","evil","fag","faggot","faggots","fake","fakes","faking","falsified","falsify",
                "fatalities","fatality","fedup","felonies","felony","fiasco","frenzy","frightening","fud","furious",
                "goddamn","greed","greenwash","greenwashing","greenwash","greenwasher","greenwashers","greenwashing",
                "guilt","guilty","hate","hated","haters","hates","hating","heartbreaking","heartbroken","horrendous",
                "horrible","horrific","horrified","humiliated","humiliation","hysteria","hysterical","hysterics",
                "idiot","idiotic","illegal","imbecile","irate","irritate","irritated","irritating","jerk","kill",
                "killed","killing","kills","liar","liars","loathe","loathed","loathes","loathing","loose","looses",
                "loser","losing","loss","lost","lunatic","lunatics","mad","maddening","madly","madness","mediocrity",
                "miserable","misleading","moron","murdering","murderous","nasty","nofun","notworking","nuts",
                "obnoxious","outrage","outraged","panic","panicked","panics","perjury","pissing","pseudoscience",
                "racism","racist","racists","rant","ranter","ranters","rants","ridiculous","scandal","scandalous",
                "scandals","screwedup","selfish","selfishness","shitty","sinful","slavery","spammer","spammers",
                "suck","sucks","swindle","swindles","swindling","terrible","terribly","terrified","terror",
                "terrorize","terrorized","terrorizes","trauma","traumatic","treason","treasonous","ugly","victim",
                "victimize","victimized","victimizes","victimizing","victims","vile","violence","violent","vitriolic",
                "wanker","warning","warnings","whitewash","withdrawal","woeful","worried","worry","worrying","worse",
                "worsen","worsened","worsening","worsens","worst","wrathful"};
        String[] negRus3 = new String[]{"ненавижу","отвращение","отвратительным","злоупотребление","злоупотребляют","злоупотребления","оскорбительным",
                "Желчный","мучиться","мучился","agonises","мучительно","мучиться","мучительный","мучается","Мучительный","гнев","гнев","сердитый","тоска","мучительный","апатичное","апатия","apeshit",
                "Арестованы","убийство","убийство","ужасный","плохо","задира","плохо","банкрот","bankster",
                "Предал","предательство","предали","предательство","предает","кровавый","скучно","взятка",
                "Катастрофой","заряженный","неприглядный","наказывать","наказанные","наказывает","наказывать","обманывать",
                "Обманутых","мошенник","мошенники","читы","сговор","заговор","сокрытие","дерьмо","преступление",
                "Уголовное","преступники","кризис","жестокий","жестокость","ущерб","ущерб","мертвые","обман","лживой",
                "Обмануть","обмануть","обманывают","обманывают","обман","дефект","дефекты","отчаяние","отчаянный",
                "Отчаяние","отчаянная","отчаянно","унылый","разрушить","уничтожить","уничтожение","разрушает",
                "Уничтожение","разрушительных","умирать","умер","тяжелые","страшный","катастрофическое","отвращение",
                "Отвращение","отвратительный","недоверие","недоверчивых","безработица","душа","придурок","ужасный",
                "Немых","тупица","зло","пидор","педик","хворост","поддельный","подделок","подделка","фальсифицированные","фальсифицировать",
                "Погибших","несчастье","fedup","преступления","Фиаско","безумие","пугающий","ФУД","ярость","Ужасный","ужасный","ужас","униженных","унижение","истерия","истерический","истерика","Идиот","идиотский","незаконный","слабоумный","разгневанный","раздражение","раздраженной","раздражает","рывок","убить","Убили","убийство","убивает","лжец","лжецы","ненавижу","ненавидел","ненавидит","ненависть","свободный","теряет","Несчастным","идиот","убийство","убийственный","противный","nofun","notworking","орехи",
                "Неприятный","возмущение","возмущенные","паника","паника","паника","лжесвидетельство","писает","лженаука",
                "Расизм","расистские","расистов","декламация","пустослов","крикунов","тирады","смешной","Скандал","скандальные",
                "Скандалы","screwedup","эгоистичный","эгоизм","дерьмовая","греховный","рабство","спамеров","спамеров",
                "Сосать","отстой","мошенничество","мошенничество","мошенничество","страшный","ужасно","страшно","террор",
                "Терроризировать","терроризировали","терроризирует","травма","травматический","измена","предательский","уродливые","жертва","Ухудшить","ухудшилось","ухудшение","ухудшается","худший","гневных"};

         String[] negAng2 = new String[]{"abandon","abandoned","abandons","abducted","abduction","abductions","accident",
                "accidental","accidentally","accidents","accusation","accusations","accuse","accused","accuses",
                "accusing","ache","aching","admonish","admonished","afraid","aggravate","aggravated","aggravates",
                "aggravating","aggression","aggressions","aggressive","aghast","alarm","alarmed","alarmist","alarmists",
                "alienation","allergic","alone","animosity","annoy","annoyance","annoyed","annoying","annoys",
                "antagonistic","anxiety","anxious","apocalyptic","appalled","appalling","apprehensive","arrest",
                "arrests","arrogant","ashame","ashamed","awkward","bailout","bamboozle","bamboozled","bamboozles",
                "ban","banned","barrier","beaten","belittle","belittled","bereave","bereaved","bereaves","bereaving",
                "biased","bitter","bitterly","bizarre","blah","blame","blamed","blames","blaming","blurry","boastful",
                "bore","bored","bother","bothered","bothers","bothersome","boycott","boycotted","boycotting","boycotts",
                "brooding","bullied","bully","bullying","bummer","burden","burdened","burdening","burdens","careless",
                "cashingin","casualty","censor","censored","censors","chagrin","chagrined","chaos","chaotic","charges",
                "cheerless","childish","choke","choked","chokes","choking","clash","clueless","cocky","coerced",
                "collapse","collapsed","collapses","collapsing","collision","collisions","complacent","complain",
                "complained","complains","condemn","condemnation","condemned","condemns","conflict","conflicting",
                "conflictive","conflicts","confuse","confused","confusing","constrained","contagion","contagions",
                "contempt","contemptuous","contemptuously","contentious","contestable","controversial",
                "controversially","cornered","costly","coward","cowardly","crash","crazier","craziest","crazy",
                "crestfallen","cried","cries","critic","criticism","criticize","criticized","criticizes","criticizing",
                "critics","crushed","crying","cynic","cynical","cynicism","danger","darkest","deadlock","death",
                "debt","defeated","defenseless","deficit","degrade","degraded","degrades","dehumanize","dehumanized",
                "dehumanizes","dehumanizing","deject","dejected","dejecting","dejects","demoralized","denied","denier",
                "deniers","denies","denounce","denounces","deny","denying","depressed","depressing","derail",
                "derailed","derails","deride","derided","derides","deriding","derision","detain","detained",
                "detention","devastate","devastated","devastating","diffident","dirt","dirtier","dirtiest","dirty",
                "disadvantage","disadvantaged","disappoint","disappointed","disappointing","disappointment",
                "disappointments","disappoints","disaster","disasters","disbelieve","disconsolate","disconsolation",
                "discontented","discord","discouraged","discredited","disdain","disgrace","disgraced","disheartened",
                "dishonest","disillusioned","disinclined","disjointed","dislike","dismal","dismayed","disorder",
                "disorganized","disoriented","disparage","disparaged","disparages","disparaging","displeased",
                "dispute","disputed","disputes","disputing","disqualified","disquiet","disregard","disregarded",
                "disregarding","disregards","disrespect","disrespected","disruption","disruptions","disruptive",
                "dissatisfied","distort","distorted","distorting","distorts","distract","distracted","distraction",
                "distracts","distress","distressed","distresses","distressing","disturb","disturbed","disturbing",
                "disturbs","dithering","dodging","dodgy","dolorous","dontlike","doom","doomed","downcast",
                "downhearted","downside","drained","dread","dreaded","dreading","dreary","droopy","drown","drowned",
                "drowns","drunk","dubious","dud","dull","dumped","dupe","duped","dysfunction","eerie","eery",
                "embarrass","embarrassed","embarrasses","embarrassing","embarrassment","embittered","emergency",
                "enemies","enemy","ennui","enrage","enraged","enrages","enraging","enslave","enslaved","enslaves",
                "envious","erroneous","error","errors","exaggerate","exaggerated","exaggerates","exaggerating",
                "excluded","exhausted","expel","expelled","expelling","expels","exploit","exploited","exploiting",
                "exploits","fad","fail","failed","failing","fails","failure","failures","fainthearted","fallen",
                "fascist","fascists","fatigue","fatigued","fatigues","fatiguing","fear","fearful","fearing",
                "fearsome","feeble","fidgety","fire","fired","firing","flop","flops","flu","flustered","fool",
                "foolish","fools","foreclosure","foreclosures","forgetful","fright","frightened","frikin","frustrate",
                "frustrated","frustrates","frustrating","frustration","fuming","gag","gagged","giddy","gloomy","glum",
                "grave","greedy","grief","grieved","gross","gullibility","gullible","hapless","haplessness","hardship",
                "harm","harmed","harmful","harming","harms","harried","harsh","harsher","harshest","haunted","havoc",
                "heavyhearted","helpless","hesitant","hesitate","hindrance","hoax","homesick","hooligan","hooliganism",
                "hooligans","hopeless","hopelessness","hostile","huckster","hunger","hurt","hurting","hurts",
                "hypocritical","ignorance","ignorant","ignored","ill","illiteracy","illness","illnesses","impatient",
                "imperfect","impotent","imprisoned","inability","inaction","inadequate","incapable","incapacitated",
                "incensed","incompetence","incompetent","inconsiderate","inconvenience","inconvenient","indecisive",
                "indifference","indifferent","indignant","indignation","indoctrinate","indoctrinated","indoctrinates",
                "indoctrinating","ineffective","ineffectively","infected","inferior","inflamed","infringement",
                "infuriate","infuriated","infuriates","infuriating","injured","injury","injustice","inquisition",
                "insane","insanity","insecure","insensitive","insensitivity","insignificant","insipid","insult",
                "insulted","insulting","insults","interrogated","interrupt","interrupted","interrupting",
                "interruption","interrupts","intimidate","intimidated","intimidates","intimidating","intimidation",
                "irresolute","itchy","jailed","jealous","jeopardy","joyless","lack","lackadaisical","lagged",
                "lagging","lags","lame","lawsuit","lawsuits","lethargic","lethargy","libelous","lied","litigious",
                "livid","lobby","lobbying","lonely","lonesome","lugubrious","meaningless","melancholy","menace",
                "menaced","mess","messed","messingup","mindless","misbehave","misbehaved","misbehaves","misbehaving",
                "misery","misgiving","misinformation","misinformed","misinterpreted","misreporting",
                "misrepresentation","miss","missed","missing","mistake","mistaken","mistakes","mistaking",
                "misunderstand","misunderstanding","misunderstands","misunderstood","moan","moaned","moaning",
                "moans","mock","mocked","mocking","mocks","mongering","monopolize","monopolized","monopolizes",
                "monopolizing","mourn","mourned","mournful","mourning","mourns","mumpish","murder","murderer",
                "murders","n00b","naive","needy","negative","negativity","neglect","neglected",
                "neglecting","neglects","nervous","nervously","nonsense","noob","nosey","notgood","notorious",
                "obliterate","obliterated","obscene","obsolete","obstacle","obstacles","obstinate","odd","offend",
                "offended","offender","offending","offends","oppressed","oppressive","optionless","outcry",
                "outmaneuvered","overreact","overreacted","overreaction","overreacts","oversell","overselling",
                "oversells","oversimplification","oversimplified","oversimplifies","oversimplify","overstatement",
                "overstatements","pain","pained","pathetic","penalty","peril","perpetrator","perpetrators",
                "perplexed","persecute","persecuted","persecutes","persecuting","perturbed","pesky","pessimism",
                "pessimistic","petrified","phobic","pique","piqued","piteous","pity","poised","poison","poisoned",
                "poisons","pollute","polluted","polluter","polluters","pollutes","poor","poorer","poorest",
                "possessive","powerless","prblm","prblms","pressured","prison","prisoner","prisoners","problem",
                "problems","profiteer","propaganda","prosecuted","protest","protesters","protesting","protests",
                "punish","punished","punishes","punitive","puzzled","quaking","questionable","rage","rageful",
                "rash","rebellion","recession","reckless","refuse","refused","refusing","regret","regretful",
                "regrets","regretted","regretting","remorse","repulsed","resentful","restless","restrict",
                "restricted","restricting","restriction","restricts","retard","retarded","revenge","revengeful",
                "riot","riots","risk","risks","rob","robber","robed","robing","robs","ruin","ruined","ruining",
                "ruins","sabotage","sad","sadden","saddened","sadly","sarcastic","scam","scams","scapegoat",
                "scapegoats","scare","scared","scary","sceptical","scold","scorn","scornful","scream","screamed",
                "screaming","screams","screwed","sedition","seditious","self-deluded","sentence","sentenced",
                "sentences","sentencing","severe","shaky","shame","shamed","shameful","shattered","shock","shocked",
                "shocking","shocks","short-sighted","short-sightedness","shortage","shortages","sick","sigh",
                "singleminded","skeptic","skeptical","skepticism","skeptics","slam","slash","slashed","slashes",
                "slashing","sleeplessness","sluggish","smear","smog","snub","snubbed","snubbing","snubs","somber",
                "sorrow","sorrowful","spam","spamming","speculative","spiritless","spiteful","stab","stabbed",
                "stabs","stall","stalled","stalling","stampede","startled","starve","starved","starves","starving",
                "steal","steals","stereotype","stereotyped","stingy","stolen","strangled","stressed","stressor",
                "stressors","stricken","strikers","struggle","struggled","struggles","struggling","stubborn","stuck",
                "stunned","stupid","stupidly","subversive","suffer","suffering","suffers","suicidal","suicide",
                "suing","sulking","sulky","sullen","suspicious","swear","swearing","swears","tard","tears","tense",
                "thorny","thoughtless","threat","threaten","threatened","threatening","threatens","threats","thwart",
                "thwarted","thwarting","thwarts","timid","timorous","tired","tits","toothless","torn","totalitarian",
                "totalitarianism","tout","touted","touting","touts","tragedy","tragic","trapped","travesty",
                "trembling","tremulous","tricked","trickery","trouble","troubled","troubles","tumor","unacceptable",
                "unappreciated","unapproved","unaware","uncomfortable","unconcerned","undermine","undermined",
                "undermines","undermining","undeserving","undesirable","uneasy","unemployment","unethical","unfair",
                "unfocused","unfulfilled","unhappy","unhealthy","unimpressed","unintelligent","unjust","unlovable",
                "unloved","unmotivated","unprofessional","unresearched","unsatisfied","unsecured","unsophisticated",
                "unstable","unsupported","unwanted","unworthy","upset","upsets","upsetting","uptight","useless",
                "uselessness","vague","vexation","vexing","vicious","violate","violated","violates","violating",
                "virulent","vulnerability","vulnerable","walkout","walkouts","war","warfare","warn","warned","warns",
                "wasted","wasting","weak","weakness","weary","weep","weeping","weird","wicked","woebegone","worthless",
                "wreck","wrong","wronged","yucky","zealot","zealots"};
        String[] negRus2 = new String[]{"отказались","отказывается","похищенных","Похищение","похищение","Случайных","случайно","обвинение","обвинения","обвинять","обвиняют","обвиняет",
                "Обвиняя","Боль","боль","наставлять","увещевали","боюсь","усугубить","усугубляется","усиливает",
                "Отчуждение","аллергический","только","враждебность","раздражать","раздражение","раздражает","раздражает","раздражает",
                "Антагонистических","тревога","тревожный","апокалиптические","ужас","ужасный","опасаются","арест",
                "Аресты","высокомерный","ashame","стыд","неловко","спасение","надувать","Bamboozled","bamboozles","Унылый","детские","душить","душили","задыхается","удушье","Столкновение","невежественный","дерзкий","принуждение",
                "Крах","свернутый","разрушается","рушится","столкновение","столкновений","самодовольным","жаловаться",
                "Жаловались","жалуется","осудить","осуждение","осудил","осуждает","конфликт","конфликт",
                "Конфликтный","конфликты","смешивать","путать","запутанной","ограничена","зараза",
                "Презрение","презрительный","презрительно","спорными","состязательный","спорными",
                "Спорно","треугольный","дорогостоящий","Трус","трусливые","крах","сумасшедшим","сумасшедшая","сумасшедший",
                "Критиков","измельченных","плач","Циник","циничным","цинизм","опасность","темный","тупик","смерть",
                "Отрицателей","отрицает","осудить","осуждает","отрицать","отрицание","депрессия","угнетающей","сорвать","высмеивают","высмеивают","высмеивает","высмеивать","насмешка","задерживать","задержанный",
                "Задержание","Сокрушение","опустошил","разрушительных","грязные","грязный","грязные",
                "Недостаток","обездоленных","разочаровал","разочарован","разочарование","разочарование",
                "Разочарований","разочаровывает","катастрофа","бедствия","верить","безутешный","disconsolation",
                "Нечестные","разочарованных","склонен","разрозненных","неприязнь","мрачный","ужас","расстройство",
                "Дезорганизованы","дезориентирован","унижать","пренебрежительно","унижает","пренебрежительное","недовольных",
                "Спор","спорными","споры","спор","дисквалифицировали","беспокойство","учитывать",
                "Игнорируя","игнорирует","неуважение","разрушение","сбои","разрушительным",
                "Недовольных","искажают","искаженное","искажает","искажает","отвлечься","отвлекаться","отвлечение",
                "Отвлекает","бедствие","проблемными","расстройства","беспокойство","беспокоить","нарушенных","нарушения",
                "Нарушает","сглаживание","уклонение","изворотливым","грустный","dontlike","гибель","обречен","опустив",
                "Унывать","недостаток","слить","страх","боялся","бояться","тоскливый","висящие","утопить","утонул",
                "Тонет","пьяный","сомнительные","безнадежный","скучно","бросила","боян","обманутый","дисфункция","жуткий","жуткий",
                "Смущать","смущение","смущает","неловко","смущение","озлобленного","чрезвычайные",
                "Врагов","враг","скука","Исступление","ярость","бесит","порабощение","порабощенных","порабощает",
                "Завистливый","ошибочное","ошибка","ошибки","преувеличивать","преувеличенные","преувеличивает","преувеличивают",
                "Исключены","исчерпала","изгнать","изгнанный","изгнание","выгоняет","эксплуатировать","эксплуатируемых","эксплуатации",
                "Подвигах","причуда","неудача","провал","сбой","неудача","неудачи","малодушным","упал",
                "Фашист","фашисты","усталость","усталость","усталость","утомительно","страх","страшный","боясь",
                "Страшный","слабый","беспокойный","огонь","выстрелил","стрельба","флоп","флоп","грипп","взволнованный","дурак",
                "Хулиганов","безнадежная","безнадежность","враждебные","барыга","голод","больно","больно","больно",
                "Несовершенным","импотент","тюрьму","неспособность","бездействие","недостаточный","неспособный","недееспособным",
                "Ярость","некомпетентность","некомпетентный","невнимательный","неудобство","неудобная","нерешительные",
                "Индоктринации","неэффективные","неэффективно","инфицированный","нижний","воспаление","нарушение",
                "Гнев","ярость","бесит","бешенство","ранен","травма","несправедливость","инквизиция",
                "Безумным","безумие","небезопасно","нечувствительным","нечувствительность","незначительная","пресным","оскорбление",
                "Оскорбил","оскорбительным","оскорбление","допрос","прерывание","прерванный","прерывание",
                "Прерывание","прерывания","запугать","запугать","пугает","запугивание","запугивание",
                "Нерешительным","зуд","тюрьму","ревнивый","опасность","безрадостное","отсутствие","вялый","отстали",
                "Отстающих","отстает","хромой","иск","иски","вялой","вялость","клеветническим","солгал","спорный",
                "Ярость","лобби","лоббирование","одиноко","одинокий","мрачный","бессмысленно","тоска","угроза",
                "Страдание","опасение","дезинформация","дезинформировали","неправильно","недостоверной",
                "Искажение","мисс","пропустили","ошибка","ошибаться","ошибки","ошибиться",
                "Недоразумение","недоразумением","стон","стонал","стонать",
                "Стонет","Макет","издевались","насмешливые","издевается","разжигание","монополизировать","монополизировал","монополизирует",
                "Монополизации","скорбим","плакал","печальный","скорбь","скорбит","Убийство","убийца",
                "Убийства","n00b","наивные","паxafve","нуждающихся","отрицательные","отрицательность","безнадзорность","забытых",
                "Пренебрежение","пренебрегает","нервная","нервно","ерунда","Новичок","любопытных","notgood","пресловутый",
                "Уничтожить","уничтожен","непристойные","устаревшим","препятствие","препятствия","упрямая","нечетное","обидеть",
                "Обиженные","преступник","обидеть","оскорбляет","угнетенный","репрессивной","optionless","протест",
                "Переиграть","чрезмерная","реагирует","перепроданности","перепроданности",
                "Oversells","упрощение","упрощенным","упрощает","упрощать","преувеличение",
                "Преувеличения","Боль","боль","жалкая","казнь","опасность","преступник","виновные",
                "Недоумение","преследовать","преследовать","преследует","преследовать","возмущенных","противные","пессимизм",
                "Пессимистические","окаменелое","фобические","пике","пробудили","жалкий","жалость","готовится","яд","отравленные",
                "Ядов","загрязнять","загрязненная","загрязнитель","загрязнители","загрязняет","бедный","бедные","бедных",
                "Притяжательный","бессильный","prblm","prblms","давление","тюрьма","Заключенный","заключенные","проблема",
                "Проблемы","спекулянт","пропаганда","преследование","протест","протестующие","протест","протесты",
                "Наказать","наказать","наказание","карательной","озадачил","дрожащий","сомнительные","ярость","яростный",
                "Сыпь","восстание","рецессия","безрассудным","отказать","отказались","отказ","сожаление","сожаления",
                "Сожаление","сожаление","сожаление","раскаяние","отбиты","обиженные","беспокойные","ограничить",
                "Ограничено","ограничение","ограничение","ограничивает","тормозят","отсталый","месть","мстительным",
                "Бунт","беспорядки","Риск","риск","грабить","разбойник","одеждах","гардеробной","грабит","разрушить","разрушена","губить",
                "Руины","саботаж","грустный","печалить","опечален","саркастический","афера","мошенничество","напугать","боюсь","страшный","скептически","бранить","презрение","презрительный","Крик","кричал",
                "Кричать","Крики","резьбовых","крамола","крамольные","самообман","предложение","приговор",
                "Приговоры","приговор","тяжелый","шаткая","стыд","стыд","позорный","разрушена","шок","шокирован",
                "Шокирующим","шоков","близорукие","близорукость","дефицит","дефицит","больной","вздох",
                "Singleminded","Скептик","скептически","скептицизм","скептики","слэм","косаячерта","сократили",
                "Рубить","бессонница","вялый","мазок","Смог","оскорбление","пренебрежительно","притормаживаний","мрачный",
                "Печаль","печальный","спам","спам","спекулятивный","бездуховной","злобный","удар","зарезали",
                "Удары","стойло","тупик","сваливание","давка","испуганный","голодать","голода","голодает","голодающие",
                "Украсть","ворует","стереотип","стереотипных","скупой","украли","задушен","подчеркнул","стресс",
                "Ошеломлены","глупый","тупо","подрывную","страдать","страдание","страдает","суицидального","самоубийство","дуться","мрачный","угрюмый","подозрительными","клянусь","ругаться","ругается","Tard","Слезы","напряженная",
                "Тоталитаризм","Tout","рекламировали","рекламировали","спекулянтами","трагедия","трагическое","ловушку","пародия",
                "Дрожащей","трепетный","обманом","обман","беда","проблемные","неприятности","опухоль","неприемлемым",
                "Недооцененными","несанкционированный","неудобно","равнодушно","подорвать","подорвала",
                "Подрывает","подрыве","заслуживающих","нежелательным","непростые","безработица","неэтичной","несправедливый",
                "Сфокусировано","невыполненные","несчастный","нездоровый","впечатления","неразумные","несправедливой","непривлекательным",
                "Нелюбимых","немотивированным","непрофессионально","unresearched","неудовлетворенный","необеспеченных","простой",
                "Неустойчивые","неподдерживаемых","нежелательный","недостойный","расстроен","расстраивает","осадки","встревоженный","бесполезный","Ненужности","смутный","досада","неприятный","порочный","нарушают","нарушили","нарушает","нарушение",
                "Крушения","неправильно","обиженных","противный","фанатик","фанатиками"};

         String[] negAng1 = new String[]{"absentee","absentees","admit","admits","admitted","affected","afflicted","affronted",
                "alas","alert","ambivalent","anti","apologise","apologised","apologises","apologising","apologize",
                "apologized","apologizes","apologizing","apology","attack","attacked","attacking","attacks","avert",
                "averted","averts","avoid","avoided","avoids","await","awaited","awaits","axe","axed","banish",
                "battle","battles","beating","bias","blind","block","blocked","blocking","blocks","bomb","broke",
                "broken","cancel","cancelled","cancelling","cancels","cancer","cautious","challenge","chilling",
                "clouded","collide","collides","colliding","combat","combats","contagious","contend","contender",
                "contending","corpse","cramp","crush","crushes","crushing","cry","curse","cut","cuts","cutting",
                "darkness","deafening","defer","deferring","defiant","delay","delayed","demand","demanded","demanding",
                "demands","demonstration","detached","difficult","dilemma","disabling","disappear","disappeared",
                "disappears","discard","discarded","discarding","discards","discounted","disguise","disguised",
                "disguises","disguising","dizzy","doubt","doubted","doubtful","doubting","doubts","drag","dragged",
                "drags","drop","dump","dumps","emptiness","empty","envies","envy","envying","escape","escapes",
                "escaping","eviction","exclude","exclusion","excuse","exempt","expose","exposed","exposes","exposing",
                "falling","farce","fight","flees","forced","forget","forgotten","frantic","frowning","funeral",
                "funerals","ghost","gloom","gray","grey","gun","hacked","hard","haunt","haunts","hid","hide","hides",
                "hiding","ignore","ignores","immobilized","impose","imposed","imposes","imposing","inhibit","ironic",
                "irony","irrational","irreversible","isolated","jumpy","lag","lazy","leak","leaked","leave","limitation",
                "limited","limits","litigation","longing","loom","loomed","looming","looms","lowest","lurk","lurking",
                "lurks","made-up","mandatory","manipulated","manipulating","manipulation","mischief","mischiefs",
                "misread","moody","mope","moping","myth","nerves","no","noisy","numb","offline","overload","overlooked",
                "overweight","oxymoron","paradox","parley","passive","passively","pay","pensive","pileup","pitied",
                "postpone","postponed","postpones","postponing","poverty","pressure","pretend","pretending","pretends",
                "prevent","prevented","preventing","prevents","prosecute","prosecutes","prosecution","provoke",
                "provoked","provokes","provoking","pushy","questioned","questioning","rainy","reject","rejected",
                "rejecting","rejects","relentless","repulse","resign","resigned","resigning","resigns","retained",
                "retreat","rig","rigged","sappy","seduced","shoot","shy","silencing","silly","sneaky","solemn","sore",
                "sorry","squelched","stifled","stop","stopped","stopping","stops","strange","strangely","strike",
                "strikes","struck","suspect","suspected","suspecting","suspects","suspend","suspended","tension","trap",
                "unbelievable","unbelieving","uncertain","unclear","unconfirmed","unconvinced","uncredited","undecided",
                "underestimate","underestimated","underestimates","underestimating","unequal","unsettled","unsure",
                "urgent","verdict","verdicts","vociferous","waste","wavering","widowed","worn"};
        String[] negRus1 = new String[]{"Заочного","отсутствующих","признаться","допускает","признался","пострадавших","страдающий","оскорбленным",
                "Увы","предупреждение","амбивалентной","анти","извинения","извинился","извинение","извинения",
                "Извинился","извинение","извинение","атака","напали","атакует","атаки","предотвращение",
                "Предотвратить","предотвращает","избегать","избегать","избегает","ожидает","ожидается","ожидает","топор","топором","изгнать",
                "Битва","бои","избиение","предвзятость","слепой","Блок","блокирован","блокирование","блоки","Бомба","сломался",
                "Сломанной","отменить","отменил","отменить","Отмена","рак","осторожных","проблема","охлаждение",
                "Дымчатый","столкновение","столкновение","столкновение","боевая","бои","заразной","утверждаю","соперник",
                "Борющихся","труп","судороги","давка","давит","дробление","Крик","Проклятие","Вырезать","сокращений","резка",
                "Требования","демонстрация","отделена","трудный","Дилемма","отключение","исчезают","исчезли",
                "Исчезает","отбросить","отбрасывается","отбрасывание","отбрасывает","скидки","маскировку","замаскированных",
                "Маскировка","маскировка","головокружение","сомнение","сомневается","сомнительно","сомневается","сомнение","сопротивление","вытащили","Тащит","Падение","свалка","свалки","пустота","пустое","зависть","зависть","зависть","побег","побег",
                "Падающих","фарсом","Борьба","бежит","вынужден","забыть","забытые","безумный","хмурый","Похороны",
                "Скрывается","выдуманные","обязательное","манипуляции","манипулирование","манипуляция","зло","шалости","оксюморон","Парадокс","пассивных","пассивно","платите","задумчивый","скопления","жалели",
                "Предотвращения","предотвратить","предотвращение","мешает","преследование","преследование","провоцируют",
                "Спровоцировали","провоцирует","провоцирующие","настойчивый","сомнение","допросы","дождливая","отклонить","отклонен",
                "Отказ","отвергает","неустанный","отражение","сохранить",
                "Извините","подавил","сдавленный","Стоп","остановилась","остановка","останавливается","странными","странным","удар",
                "Недооценивают","недооценена","недооценивает","недооценки","неравный","нерешенные",
                "Срочные","Приговор","приговоры","шумный","отходы","колеблющиеся","овдовевшая","носить"};

         String[] posAng5 = new String[]{"breathtaking","hurrah","outstanding","superb","thrilled"};
         String[] posRus5 = new String[]{"захватывающий","ура","выдающийся","превосходный","восторг"};

         String[] posAng4 = new String[]{"amazing","awesome","brilliant","ecstatic","euphoric","exuberant","fabulous","fantastic",
                "fun","funnier","funny","godsend","heavenly","lifesaver","lmao","lmfao","masterpiece","masterpieces",
                "miracle","overjoyed","rapturous","rejoice","rejoiced","rejoices","rejoicing","rofl","roflcopter",
                "roflmao","rotfl","rotflmfao","rotflol","stunning","terrific","triumph","triumphant","win","winner",
                "winning","wins","wonderful","wooo","woow","wow","wowow","wowww"};
         String[] posRus4=new String[]{"Удивительно","удивительный","блестящая","экстатический","эйфории","буйный","сказочная","фантастическим","Чудо","радость","восторженный","радуйся","радовались","радуется","радость","ROFL","roflcopter","ROFLMAO","ROTFL","rotflmfao","rotflol","потрясающий","потрясающий","Триумф","триумфальное","победа","победитель","победе","победы","замечательным","Wooo","Woow","вау","WOWOW","wowww"};

         String[] posAng3 = new String[]{"admire","admired","admires","admiring","adorable","adore","adored","adores","affection",
                "affectionate","amuse","amused","amusement","amusements","astound","astounded","astounding",
                "astoundingly","astounds","audacious","award","awarded","awards","beatific","beauties","beautiful",
                "beautifully","beautify","beloved","best","blessing","bliss","blissful","blockbuster","breakthrough",
                "captivated","celebrate","celebrated","celebrates","celebrating","charm","charming","cheery","classy",
                "coolstuff","dearly","delight","delighted","delighting","delights","devoted","elated","elation",
                "enrapture","enthral","enthusiastic","euphoria","excellence","excellent","excite","excited",
                "excitement","exciting","exhilarated","exhilarates","exhilarating","exultant","exultantly","faithful",
                "fan","fascinate","fascinated","fascinates","fascinating","ftw","gallant","gallantly","gallantry",
                "genial","glad","glamorous","glamourous","glee","gleeful","good","goodness","gracious","grand",
                "grateful","great","greater","greatest","haha","hahaha","hahahah","happiness","happy","heartfelt",
                "heroic","humerous","impress","impressed","impresses","impressive","inspiring","joy","joyful",
                "joyfully","joyous","jubilant","kudos","lawl","lol","lovable","love","loved","lovelies","lovely",
                "loyal","loyalty","luck","luckily","lucky","marvel","marvelous","marvels","medal","merry","mirth",
                "mirthful","mirthfully","nice","ominous","once-in-a-lifetime","paradise","perfect","perfectly",
                "pleasant","pleased","pleasure","popular","praise","praised","praises","praising","prosperous",
                "rightdirection","rigorous","rigorously","scoop","sexy","soothe","soothed","soothing","sparkle",
                "sparkles","sparkling","splendid","successful","super","vibrant","vigilant","visionary","vitality",
                "vivacious","wealth","winwin","won","woo","woohoo","worshiped","yummy"};
        String[] posRus3 = new String[]{"полюбоваться","восхищение","восхищается","восхищение","прелестный","обожают","обожаемого","обожает","любовь",
                "ласковый","развлечься","смешно","развлечения","развлечения","поражать","поражен","поразительно",
                "поразительно","поражает","смелый","награда","награжден","награды","блаженным","красота","красивая","дорого","радость","рад","радуя","наслаждение","посвященных","приподнятом","восторг",
                "восхищать","восторг","энтузиазм","Эйфория","совершенство","превосходный","возбуждают","возбужденный",
                "вентилятор","очаровывать","очарованный","очаровывает","увлекательный","FTW","галантный","галантно","храбрость",
                "гениальным","рад","гламурный","гламурный","радость","радостный","хороший","доброта","добрый","великий",
                "благодарный","великий","большой","величайший","ха-ха","хахаха","hahahah","счастье","счастливый","сердечные",
                "героической","humerous","впечатление","впечатление","впечатляет","впечатляющие","вдохновляющим","радость","радостным",
                "радостно","радостный","ликующие","престижность","Lawl","LOL","привлекательный","любовь","любил","красотки","прекрасный",
                "лояльных","верность","удача","счастливый","Чудо","чудесный","чудес","Медаль","веселый","веселье",
                "веселым","mirthfully","хороший","зловещий","Рай","идеальное","отлично",
                "приятных","рад","удовольствие","популярная","хвала","похвалил","похвалы","хвалить","процветающей",
                "rightdirection","строгий","строго","совок","сексуальная","успокаивают","успокоил","успокаивающих","блеск",
                "блестками","сверкающий","великолепный","успешный","супер","яркий","бдительность","провидец","жизнеспособность",
                "живой","богатство","WinWin","выиграли","ву","Woohoo","поклоняться","вкусное"};

         String[] posAng2 = new String[]{"abilities","ability","absolve","absolved","absolves","absolving","accomplish",
                "accomplished","accomplishes","acquit","acquits","acquitted","acquitting","advantage","advantages",
                "adventure","adventures","adventurous","agog","agreeable","amaze","amazed","amazes","ambitious",
                "appease","appeased","appeases","appeasing","applaud","applauded","applauding","applauds","applause",
                "appreciate","appreciated","appreciates","appreciating","appreciation","approval","approved",
                "approves","asset","assets","astonished","attracting","attraction","attractions","avid","backing",
                "bargain","benefit","benefits","benefitted","benefitting","better","bless","blesses","blithe",
                "bold","boldly","brave","brightest","brisk","buoyant","calm","calmed","calming","calms","care",
                "careful","carefully","cares","chance","chances","cheer","cheered","cheerful","cheering","cheers",
                "cherish","cherished","cherishes","cherishing","chic","clarifies","clarity","clean","cleaner",
                "clever","comfort","comfortable","comforting","comforts","commend","commended","commitment",
                "compassionate","competent","competitive","comprehensive","conciliate","conciliated","conciliates",
                "conciliating","confidence","confident","congrats","congratulate","congratulation","congratulations",
                "consent","consents","consolable","convivial","courage","courageous","courteous","courtesy",
                "coziness","creative","cute","daredevil","daring","dauntless","dear","debonair","dedicated",
                "defender","defenders","desirable","desired","desirous","determined","eager","earnest","ease",
                "effective","effectively","elegant","elegantly","empathetic","enchanted","encourage","encouraged",
                "encouragement","encourages","endorse","endorsed","endorsement","endorses","energetic","enjoy",
                "enjoying","enjoys","enlighten","enlightened","enlightening","enlightens","entertaining","entrusted",
                "esteemed","ethical","exasperated","exclusive","exonerate","exonerated","exonerates","exonerating",
                "fair","favor","favored","favorite","favorited","favorites","favors","fearless","fervent","fervid",
                "festive","fine","flagship","focused","fond","fondness","fortunate","freedom","friendly","frisky",
                "fulfill","fulfilled","fulfills","funky","futile","gain","gained","gaining","gains","generous","gift",
                "glorious","glory","gratification","greetings","growth","ha","hail","hailed","hardier","hardy",
                "healthy","heaven","help","helpful","helping","helps","hero","heroes","highlight","hilarious","honest",
                "honor","honored","honoring","honour","honoured","honouring","hope","hopeful","hopefully","hopes",
                "hoping","hug","hugs","humor","humorous","humour","humourous","immortal","importance","important",
                "improve","improved","improvement","improves","improving","indestructible","infatuated","infatuation",
                "influential","innovative","inquisitive","inspiration","inspirational","inspire","inspired","inspires",
                "intact","integrity","intelligent","interested","interesting","intricate","invincible","invulnerable",
                "irresistible","irresponsible","jaunty","jocular","joke","jokes","jolly","jovial","justice",
                "justifiably","justified","kind","kinder","kiss","landmark","like","liked","likes","lively","loving",
                "mature","meaningful","mercy","methodical","motivated","motivating","nifty","noble","novel","obsessed",
                "oks","opportunities","opportunity","optimism","optimistic","outreach","pardon","pardoned","pardoning",
                "pardons","passionate","peace","peaceful","peacefully","perfected","perfects","picturesque","playful",
                "positive","positively","powerful","privileged","proactive","progress","prominent","proud","proudly",
                "rapture","raptured","raptures","ratified","reassuring","recommend","recommended","recommends",
                "redeemed","relaxed","reliant","relieved","relieving","relishing","remarkable","rescue","rescued",
                "rescues","resolute","resolve","resolved","resolves","resolving","respected","responsible",
                "responsive","restful","revered","revive","revives","reward","rewarded","rewarding","rewards",
                "rich","robust","romance","satisfied","save","saved","secure","secured","secures","self-confident",
                "serene","sincere","sincerely","sincerest","sincerity","slick","slicker","slickest","smarter",
                "smartest","smile","smiled","smiles","smiling","solid","solidarity","sophisticated","spirited",
                "sprightly","stable","stamina","steadfast","stimulating","stout","strength","strengthen",
                "strengthened","strengthening","strengthens","strong","stronger","strongest","suave","success",
                "sunshine","superior","support","supported","supportive","supports","survived","surviving","survivor",
                "sweet","swift","swiftly","sympathetic","sympathy","tender","thank","thankful","thanks","thoughtful",
                "tolerant","top","tops","tranquil","treasure","treasures","true","trusted","unbiased","unequaled",
                "unstoppable","untarnished","useful","usefulness","vindicate","vindicated","vindicates","vindicating",
                "virtuous","warmth","wealthy","welcome","welcomed","welcomes","willingness","worth","worthy","yeees",
                "youthful"};
        String[] posRus2 = new String[]{"Способностей","способность","освобождают","освобождаются","освобождает","освобождающий","выполнить",
                "Опытным","выполняет","оправдать","оправдал","оправдан","оправдания","Преимущество","преимуществами",
                "Приключение","Приключения","авантюрный","жадно","приятный","поражать","поражен","поражает","амбициозные",
                "Ценить","оценили","оценивает","оценивая","признательность","утверждение","утвержденный",
                "Утверждает","активы","активы","поражен","привлечение","притяжение","Достопримечательности","энергичный","поддержка",
                "Сделка","выгода","выгоды","выгоду","лучше","Благослови","благословляет","веселый",
                "Смелый","смело","храбрый","яркий","оживленная","плавучие","спокойный","успокоил","успокаивающих","успокаивается","забота",
                "Осторожным","внимательно","заботится","шанс","шансы","настроение","приветствовали","веселый","аплодисменты","ура",
                "Лелеять","заветное","греет","лелеять","шикарного","уточняет","ясность","чистый","чище",
                "Умный","комфорт","удобный","утешительные","комфорт","воздать","оценил","обязательство",
                "Сострадательный","компетентный","конкурентные","всеобъемлющий","примирить","мириться","примиряет",
                "Согласие","согласие","consolable","праздничный","мужество","мужественный","вежливый","вежливость",
                "Уют","творческая","милая","Сорвиголова","смелый","бесстрашный","дорогая","веселый","посвященных",
                "Защитник","защитники","желательно","желанный","желающие","определить","стремится","серьезный","легкость",
                "Эффективный","эффективно","элегантная","элегантно","чуткие","заколдованных","поощряют","рекомендуется",
                "Поощрение","поощряет","одобрить","одобрено","одобрение","одобряет","энергичный","нравится",
                "Уважаемый","этический","раздраженный","эксклюзивные","реабилитировать","реабилитировали","реабилитирует","невиновности",
                "Справедливой","польза","выступает","любимая","избранном","избранные","польза","бесстрашный","горячий","пылкий",
                "Праздничный","прекрасно","флагманские","внимание","любил","любовь","счастье","свобода","дружественный","резвая",
                "Славного","слава","наслаждение","привет","рост","га","град","приветствовали","выносливые","выносливый",
                "Честь","заслуженный","честь","честь","честь","честь","надежда","надежда","надеюсь","надеется",
                "Надеясь","объятие","объятия","юмор","юмористическое","юмор","юмора","бессмертные","значение","важно",
                "Непреодолимое","безответственным","Бойкий","шутливое","Шутка","шутки","веселый","веселый","справедливость",
                "Восторг","восхищены","восторг","ратифицирована","обнадеживает","рекомендуется","рекомендуется","рекомендуется",
                "Погашены","расслабленный","полагаться","облегчение","освобождение","наслаждается","замечательный","спасательные","спас",
                "Спасает","решительный","решения","решил","решает","решения","уважаемый","ответственный",
                "Отзывчивым","спокойный","почитаемые","возрождение","оживает","награда","вознагражден","полезный","награды",
                "Богатый","надежный","романтика","удовлетворен","сохранить","сохранить","безопасный","обеспеченный","обеспечивает",
                "Спокойный","искренние","искренне","искренние","искренность","ловкий","плащ","гладкий","умнее",
                "Умных","Улыбка","улыбнулась","улыбки","улыбается","твердый","солидарность","сложный","энергичный",
                "Бодрый","стабильные","выносливость","стойкий","стимулирование","толстый","сила","укрепление",
                "Укрепить","укрепление","укрепляет","сильный","сильный","сильнейший","учтивый","успех",
                "Терпимым","верхний","вершины","спокойный","сокровище","сокровища","истинный","доверенных","беспристрастный","непревзойденный","Молодой"};

         String[] posAng1 = new String[]{"aboard","absorbed","accept","accepted","accepting","accepts","achievable","active",
                "adequate","adopt","adopts","advanced","agree","agreed","agreement","agrees","alive","allow",
                "anticipation","ardent","attract","attracted","attracts","authority","backed","backs","big","boost",
                "boosted","boosting","boosts","bright","brightness","capable","carefree","certain","clear","cleared",
                "clearly","clears","comedy","commit","commits","committed","committing","compelled","convince",
                "convinced","convinces","cool","curious","decisive","desire","diamond","dream","dreams","easy",
                "embrace","engage","engages","engrossed","ensure","ensuring","enterprising","entitled","expand",
                "expands","exploration","explorations","extend","extends","faith","fame","feeling","fit","fitness",
                "forgive","forgiving","free","fresh","god","grace","grant","granted","granting","grants","greet",
                "greeted","greeting","greets","growing","guarantee","haunting","huge","immune","increase","increased",
                "innovate","innovates","innovation","intense","interest","interests","intrigues","invite","inviting",
                "jesus","jewel","jewels","join","keen","laugh","laughed","laughing","laughs","laughting","launched",
                "legal","legally","lenient","lighthearted","matter","matters","meditative","motivate","motivation",
                "natural","please","pray","praying","prays","prepared","pretty","promise","promised","promises",
                "promote","promoted","promotes","promoting","prospect","prospects","protect","protected","protects",
                "reach","reached","reaches","reaching","reassure","reassured","reassures","relieve","relieves",
                "restore","restored","restores","restoring","safe","safely","safety","salient","share","shared",
                "shares","significance","significant","smart","sobering","solution","solutions","solve","solved",
                "solves","solving","spark","spirit","stimulate","stimulated","stimulates","straight","substantial",
                "substantially","supporter","supporters","supporting","trust","unified","united","unmatched",
                "validate","validated","validates","validating","vested","vision","visioning","visions","vitamin",
                "want","warm","whimsical","wish","wishes","wishing","yeah","yearning","yes"};
        String[] posRus1 = new String[]{"поглощается","принимать","принятый","принятие","принимает","достижимыми","активный","Адекватный","принятие","принимает","продвинутый","согласен","договорились","соглашение","согласен","живым","позволять","Ожидание","горячий","привлекать","привлекает","привлекает","власть","ценные","спиной","большой","импульс","Ясно","очищает","комедия","совершать","совершает","совершенных","совершение","вынужден","убедить",
                "Убежден","убеждает","прохладно","любопытный","решающим","желание","алмаз","Мечта","мечты","легкий",
                "Обнять","участие","занимается","поглощены","обеспечить","обеспечение","предприимчивый","право","расширить",
                "Расширяется","разведка","исследования","расширить","расширяет","вера","слава","чувство","соответствовать","Фитнес",
                "Простить","прощайте","свободный","свежий","бог","благодать","грант","предоставляется","предоставление","гранты","приветствую",
                "драгоценность","присоединится","острый","смех","смеялся","смех","смех","смеется","начало",
                "Легальным","юридически","мягкие","беззаботный","материя","вопросы","медитативный","мотивировать","мотивация",
                "Естественным","пожалуйста","подготовлены","довольно","обещание","обещал","обещает",
                "Содействовать","способствовал","способствует","содействие","Перспектива","перспективы","защита","защита","защищает",
                "Достигать","достиг","достигает","достижения","успокоить","успокоила","заверяет","снять","освобождает",
                "Восстановить","восстановить","восстанавливает","восстановление","безопасный","безопасное","безопасность","важных","доля","общие","Долей","значение","значительный","умный","отрезвляющий","Решение","Решения","решить","решил",
                "Решает","решения","искра","дух","стимулировать","стимулировали","стимулирует","прямой","существенным",
                "Существенно","сторонник","сторонники","поддержка","доверие","единое","единый","непревзойденный",
                "Проверить","подтверждено","проверяет","проверка","корыстные","видения","видения","видения","Витамин",
                "Хочу","теплый","причудливый","желание","желание","желающих","да","тоска","да"};

        ArrayList<ArrayList<String>> data;

        HardcodeDictionary()
        {
                data = new ArrayList<>();
                for (int i = 0; i<posAng1.length; i++)
                {
                        posAng1[i]=posAng1[i].toLowerCase();
                }
                data.add(new ArrayList<String>(Arrays.asList(posAng1)));
                for (int i = 0; i<posAng2.length; i++)
                {
                        posAng2[i]=posAng2[i].toLowerCase();
                }
                data.add(new ArrayList<String>(Arrays.asList(posAng2)));
                for (int i = 0; i<posAng3.length; i++)
                {
                        posAng3[i]=posAng3[i].toLowerCase();
                }
                data.add(new ArrayList<String>(Arrays.asList(posAng3)));
                for (int i = 0; i<posAng4.length; i++)
                {
                        posAng4[i]=posAng4[i].toLowerCase();
                }
                data.add(new ArrayList<String>(Arrays.asList(posAng4)));
                for (int i = 0; i<posAng5.length; i++)
                {
                        posAng5[i]=posAng5[i].toLowerCase();
                }
                data.add(new ArrayList<String>(Arrays.asList(posAng5)));


                for (int i = 0; i<posRus1.length; i++)
                {
                        posRus1[i]=posRus1[i].toLowerCase();
                }
                data.add(new ArrayList<String>(Arrays.asList(posRus1)));
                for (int i = 0; i<posRus2.length; i++)
                {
                        posRus2[i]=posRus2[i].toLowerCase();
                }
                data.add(new ArrayList<String>(Arrays.asList(posRus2)));
                for (int i = 0; i<posRus3.length; i++)
                {
                        posRus3[i]=posRus3[i].toLowerCase();
                }
                data.add(new ArrayList<String>(Arrays.asList(posRus3)));
                for (int i = 0; i<posRus4.length; i++)
                {
                        posRus4[i]=posRus4[i].toLowerCase();
                }
                data.add(new ArrayList<String>(Arrays.asList(posRus4)));
                for (int i = 0; i<posRus5.length; i++)
                {
                        posRus5[i]=posRus5[i].toLowerCase();
                }
                data.add(new ArrayList<String>(Arrays.asList(posRus5)));


                //neg

                for (int i = 0; i<negAng1.length; i++)
                {
                        negAng1[i]=negAng1[i].toLowerCase();
                }
                data.add(new ArrayList<String>(Arrays.asList(negAng1)));
                for (int i = 0; i<negAng2.length; i++)
                {
                        negAng2[i]=negAng2[i].toLowerCase();
                }
                data.add(new ArrayList<String>(Arrays.asList(negAng2)));
                for (int i = 0; i<negAng3.length; i++)
                {
                        negAng3[i]=negAng3[i].toLowerCase();
                }
                data.add(new ArrayList<String>(Arrays.asList(negAng3)));
                for (int i = 0; i<negAng4.length; i++)
                {
                        negAng4[i]=negAng4[i].toLowerCase();
                }
                data.add(new ArrayList<String>(Arrays.asList(negAng4)));
                for (int i = 0; i<negAng5.length; i++)
                {
                        negAng5[i]=negAng5[i].toLowerCase();
                }
                data.add(new ArrayList<String>(Arrays.asList(negAng5)));


                for (int i = 0; i<negRus1.length; i++)
                {
                        negRus1[i]=negRus1[i].toLowerCase();
                }
                data.add(new ArrayList<String>(Arrays.asList(negRus1)));
                for (int i = 0; i<negRus2.length; i++)
                {
                        negRus2[i]=negRus2[i].toLowerCase();
                }
                data.add(new ArrayList<String>(Arrays.asList(negRus2)));
                for (int i = 0; i<negRus3.length; i++)
                {
                        negRus3[i]=negRus3[i].toLowerCase();
                }
                data.add(new ArrayList<String>(Arrays.asList(negRus3)));
                for (int i = 0; i<negRus4.length; i++)
                {
                        negRus4[i]=negRus4[i].toLowerCase();
                }
                data.add(new ArrayList<String>(Arrays.asList(negRus4)));
                for (int i = 0; i<negRus5.length; i++)
                {
                        negRus5[i]=negRus5[i].toLowerCase();
                }
                data.add(new ArrayList<String>(Arrays.asList(negRus5)));
                ListIterator<ArrayList<String>> iterator = data.listIterator();
                while (iterator.hasNext())
                {
                        Collections.sort(iterator.next());
                        //System.out.println(iterator.previousIndex());
                }
        }


        @Override
        int returnScoreOfWord(String word) {
                ListIterator<ArrayList<String>> iterator = data.listIterator();
                while (iterator.hasNext())
                {
                        ArrayList<String> tmp = iterator.next();
                        if (containsInArray(word,tmp,0,tmp.size()-1))
                        {
                                return scoreData[iterator.previousIndex()];
                        }
                }
                return 0;
        }

        private boolean containsInArray(String word, ArrayList<String> array, long l, long r)
        {
                int length = word.length();
                int maxFault = ((length/5)+1);

                if (l>r)
                {
                        return  false;
                }
                long mid = l+(r-l)/2;
                if (editDist(word,array.get((int)mid))<=maxFault)
                {
                        return true;
                } else if (word.compareTo(array.get((int)mid))<0)
                {
                        return containsInArray(word,array,l,mid-1);
                } else
                {
                        return containsInArray(word,array,mid+1,r-1);
                }

        }

        private static int rank(int val, int[] arr, int lo, int hi) {
                if (lo > hi) return -1;

                int mid = lo + (hi - lo) / 2;

                if (val < arr[mid]) {
                        return rank(val, arr, lo, mid - 1);
                } else if (val > arr[mid]) {
                        return rank(val, arr, mid + 1, hi);
                } else {
                        return mid;
                }
        }


        private int editDist(String S1, String S2) {
                int m = S1.length(), n = S2.length();
                int[] D1;
                int[] D2 = new int[n + 1];

                for(int i = 0; i <= n; i ++)
                        D2[i] = i;

                for(int i = 1; i <= m; i ++) {
                        D1 = D2;
                        D2 = new int[n + 1];
                        for(int j = 0; j <= n; j ++) {
                                if(j == 0) D2[j] = i;
                                else {
                                        int cost = (S1.charAt(i - 1) != S2.charAt(j - 1)) ? 1 : 0;
                                        if(D2[j - 1] < D1[j] && D2[j - 1] < D1[j - 1] + cost)
                                                D2[j] = D2[j - 1] + 1;
                                        else if(D1[j] < D1[j - 1] + cost)
                                                D2[j] = D1[j] + 1;
                                        else
                                                D2[j] = D1[j - 1] + cost;
                                }
                        }
                }
                return D2[n];
        }


}
