package com.hechuangwu.volley.model;

import java.util.List;

/**
 * Created by cwh on 2019/12/12 0012.
 * 功能:
 */
public class News {

    /**
     * reason : 鎴愬姛鐨勮繑鍥�
     * result : {"stat":"1","data":[{"uniquekey":"517163d86c9bd4d53fc2b117d27c99ed","title":"寮�蹇冧竴鍒伙細琛ㄥ摜鑺变簡濂藉嚑涓囪拷閰掑惂鏈嶅姟鍛橈紝杩樻槸琚嫆锛屽濡堣锛�500","date":"2019-12-12 14:27","category":"澶存潯","author_name":"骞介粯妗�","url":"http://mini.eastday.com/mobile/191212142749666.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20191212/20191212142749_de2c8c015ebd2d039f466f4089ccf0ab_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20191212/20191212142749_de2c8c015ebd2d039f466f4089ccf0ab_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06imgmini.eastday.com/mobile/20191212/20191212142749_de2c8c015ebd2d039f466f4089ccf0ab_4_mwpm_03200403.jpg"},{"uniquekey":"f9d1ba58378fc474d9479b04db83e756","title":"浜庡皬褰よ妭鐩腑璺熻枃钖囨悅鎼傛姳鎶憋紝褰撻暅澶存媺杩戝悗锛岄檲灏忕涵瑕佸け鎺т簡锛�","date":"2019-12-12 14:21","category":"澶存潯","author_name":"鐖嗙垎濞变箰鍦�","url":"http://mini.eastday.com/mobile/191212142107456.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20191212/20191212142107_32cdc6b48426c9b3adba035137b648d3_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20191212/20191212142107_32cdc6b48426c9b3adba035137b648d3_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20191212/20191212142107_32cdc6b48426c9b3adba035137b648d3_3_mwpm_03200403.jpg"},{"uniquekey":"c472a8a59ffb68d1b9a4f428ea46698f","title":"鈥滆倸閲忊�濇渶澶х殑娉曟媺鍒╋紒宸ㄥぇ鍏ㄩ�忔槑灏剧锛�40骞磋溅榫勫崠1700涓�","date":"2019-12-12 14:18","category":"澶存潯","author_name":"ZAKER缃�","url":"http://mini.eastday.com/mobile/191212141802779.html","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20191212/20191212141802_b3a59ced696d524d724700fce39df6a2_5_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03imgmini.eastday.com/mobile/20191212/20191212141802_b3a59ced696d524d724700fce39df6a2_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03imgmini.eastday.com/mobile/20191212/20191212141802_b3a59ced696d524d724700fce39df6a2_4_mwpm_03200403.jpg"},{"uniquekey":"a4acce1f16b68095f80b72a338330abe","title":"閮戞櫤鍙戦鏈夊鎭愭�栵紝鍥借冻灏忓皢鎯婂嚭涓�韬喎姹楋紝闃熷弸鎯婂憜浜�","date":"2019-12-12 14:16","category":"澶存潯","author_name":"ZAKER缃�","url":"http://mini.eastday.com/mobile/191212141617690.html","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20191212/20191212141617_433e78ca79287b15e1d54789516d9b7e_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08imgmini.eastday.com/mobile/20191212/20191212141617_433e78ca79287b15e1d54789516d9b7e_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08imgmini.eastday.com/mobile/20191212/20191212141617_433e78ca79287b15e1d54789516d9b7e_2_mwpm_03200403.jpg"},{"uniquekey":"407025c573576c697a557cc31df63a62","title":"鑺墖鍐嶅害浜戣捣浜戞秾锛屽叧娉≒CB娑ㄤ环姒傚康","date":"2019-12-12 14:15","category":"澶存潯","author_name":"閲戣瀺鑰佹暀鎺�","url":"http://mini.eastday.com/mobile/191212141510440.html","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20191212/20191212141510_f60372de86aacf12e5f0f5c2cbf0ef22_2_mwpm_03200403.jpg"},{"uniquekey":"b5f50c1b1e8c7df95fb730ebc8e8526f","title":"閭兏甯備粖骞村叏鍔涙彁鍗囦究姘戝競鍦哄缓璁炬按骞�","date":"2019-12-12 14:13","category":"澶存潯","author_name":"閭兏鏂伴椈缃�","url":"http://mini.eastday.com/mobile/191212141356925.html","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20191212/20191212141356_edaaa5fcbbad94494e442e7a8610006c_1_mwpm_03200403.jpg"},{"uniquekey":"b3c03608bb1ce604ec8f9bfcc5edbde0","title":"鍊Ξ澶у啲澶╃┛鏃犺偐闀胯 澶╅箙棰堝お浼樿秺 鍐峰埌绱ф彙鍙屾嫵缁х画寰瑧钀ヤ笟","date":"2019-12-12 14:13","category":"澶存潯","author_name":"鏄庢槦娆箰棰�","url":"http://mini.eastday.com/mobile/191212141341555.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20191212/20191212141341_0398f7d59e5ea138339e8cd1eccc0194_5_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20191212/20191212141341_0398f7d59e5ea138339e8cd1eccc0194_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06imgmini.eastday.com/mobile/20191212/20191212141341_0398f7d59e5ea138339e8cd1eccc0194_6_mwpm_03200403.jpg"},{"uniquekey":"64a0ac7fd0f5a66e428b7c42f20f4ce6","title":"鍐ぉ鏄編鐧界殑鈥滈粍閲戞湡鈥濓紝濂充汉闆锋墦涓嶅姩鍋氳繖3鐐癸紝鐨偆鍙堢櫧鍙堟按娑�","date":"2019-12-12 14:12","category":"澶存潯","author_name":"鎶よ偆灏忓姪鐞�","url":"http://mini.eastday.com/mobile/191212141241887.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20191212/20191212141241_9930fec87f6bc606553d20249cfe818c_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20191212/20191212141241_9930fec87f6bc606553d20249cfe818c_5_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07imgmini.eastday.com/mobile/20191212/20191212141241_9930fec87f6bc606553d20249cfe818c_7_mwpm_03200403.jpg"},{"uniquekey":"8efac69c64b249c08f97f4c0670207e8","title":"灞辫タ涓�涓绂佹缃戣喘鍙戠幇灏辨病鏀讹紝寰嬪笀锛氳琛屼负渚电姱瀛︾敓鏉冨埄","date":"2019-12-12 14:10","category":"澶存潯","author_name":"绾电浉鏂伴椈","url":"http://mini.eastday.com/mobile/191212141027147.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20191212/2019121214_d5297468750042cb94ef5ec303212eb0_9318_cover_mwpm_03200403.jpg"},{"uniquekey":"1433fab843ff3a27e5313f711578fa4f","title":"涓�缇ゅぇ鐧介波鍑虹幇鍦ㄧ編鍥芥捣宀� 鍏朵腑涓�鏉¤韩闀�15鑻卞昂銆佷綋閲�600鍏枻","date":"2019-12-12 14:07","category":"澶存潯","author_name":"鍖楅潚缃�","url":"http://mini.eastday.com/mobile/191212140754322.html","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20191212/20191212140754_06a27ca05b2115fba9aa2eb8b82b5da5_1_mwpm_03200403.jpg"},{"uniquekey":"26cf6d4f83e5dd9d3886caf86672c0fe","title":"浠栨槸缁冧範鐢熷嚭韬紝鑳藉敱鑳借烦杩樿兘涓婄患鑹猴紝濡備粖婕旀妧椋炶穬鍦堢矇鍦堜腑鍓嶈緢","date":"2019-12-12 14:06","category":"澶存潯","author_name":"鐧句箞瑗垮ū涔�","url":"http://mini.eastday.com/mobile/191212140632815.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20191212/2019121214_72c80c89715a47bf8d98127b601dbd7b_9601_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20191212/2019121214_993753871b25480996f4204fabc08494_0906_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07imgmini.eastday.com/mobile/20191212/2019121214_27f5ee076ad347c4a2a97238bd73aea3_9209_cover_mwpm_03200403.jpg"},{"uniquekey":"50ccd9ba18366cdd326b16404d37a1ac","title":"鐜嬭�呰崳鑰�锛氱帺瀹舵渶鏈熸湜纰庣墖鍟嗗簵涓婃灦鐨勭毊鑲わ紝鍗冨勾涔嬬嫄涓婃锛�","date":"2019-12-12 14:00","category":"澶存潯","author_name":"鐜嬭�呰崳鑰�瀹樼綉","url":"http://mini.eastday.com/mobile/191212140006504.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20191212/20191212140006_29d23a3bf234a5aa68f70383cbb52c66_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04imgmini.eastday.com/mobile/20191212/20191212140006_29d23a3bf234a5aa68f70383cbb52c66_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04imgmini.eastday.com/mobile/20191212/20191212140006_29d23a3bf234a5aa68f70383cbb52c66_2_mwpm_03200403.jpg"},{"uniquekey":"72a524e7f7e0f40d13d75e639e50c6e0","title":"32宀佸噯濡堝锛屾��瀛�30鍛紝鎰熸煋浜嗘垔鑲濓紝鍏跺師鍥狅細鈥滃鍗栤�濆彲鑳芥�ф渶澶�","date":"2019-12-12 14:00","category":"澶存潯","author_name":"瀵诲尰闂嵂缃�","url":"http://mini.eastday.com/mobile/191212140000455.html","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20191212/20191212140000_0f4e39a4573afa2dfd409639e3535f1f_1_mwpm_03200403.jpg"},{"uniquekey":"4eacdbf46ead4f6ffcde8f35a1636c69","title":"濡傛灉鍑虹幇杩�5绉嶇棁鐘朵箣涓�锛屽氨瑕佸皬蹇冧綋鍐呮湁琛�鏍撲簡","date":"2019-12-12 14:00","category":"澶存潯","author_name":"瀵诲尰闂嵂缃�","url":"http://mini.eastday.com/mobile/191212140000029.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20191212/20191212140000_b658fb6ad137fef2c1cf0e368fe49e91_1_mwpm_03200403.jpg"},{"uniquekey":"775e41410138368aacc374c48f773e60","title":"鎼炵瑧GIF:瀚傚瓙锛屼綘鑳戒笉鑳界粰澶у摜鐐归潰瀛愶紝鐩存挱鍛�","date":"2019-12-12 13:58","category":"澶存潯","author_name":"鎼炵瑧鐨勬瀛愮帇","url":"http://mini.eastday.com/mobile/191212135808539.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20191212/20191212135808_d169ffe84e44534456acd0c1b4a4c971_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20191212/20191212135808_d169ffe84e44534456acd0c1b4a4c971_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20191212/20191212135808_d169ffe84e44534456acd0c1b4a4c971_4_mwpm_03200403.jpg"},{"uniquekey":"4bb893dca22efdd69424a5c20d56556b","title":"澶х儹蹇呮锛佹鍐犺禂鐜囧嚭鐐夊紩浜夎锛氳繖鏀绉樹箣甯堝凡缁忊�滀笁杩炲啝鈥濅簡","date":"2019-12-12 13:58","category":"澶存潯","author_name":"ZAKER缃�","url":"http://mini.eastday.com/mobile/191212135808351.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20191212/20191212135808_df691751d1ea73de0c2884b624e7eb33_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02imgmini.eastday.com/mobile/20191212/20191212135808_df691751d1ea73de0c2884b624e7eb33_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02imgmini.eastday.com/mobile/20191212/20191212135808_df691751d1ea73de0c2884b624e7eb33_2_mwpm_03200403.jpg"},{"uniquekey":"795578336a6f6b886dbc279296ced610","title":"娴欐睙涓崡浠庡缓绛戣涓氬埌鍔ㄦ极琛屼笟鐨勮法棰嗗煙浜т笟鍗囩骇","date":"2019-12-12 13:58","category":"澶存潯","author_name":"浠婃棩涓摬","url":"http://mini.eastday.com/mobile/191212135804808.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20191212/20191212135804_57ec568a0315b025e9e016359109981b_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05imgmini.eastday.com/mobile/20191212/20191212135804_57ec568a0315b025e9e016359109981b_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05imgmini.eastday.com/mobile/20191212/20191212135804_57ec568a0315b025e9e016359109981b_1_mwpm_03200403.jpg"},{"uniquekey":"d4b22b77c30605c75ca8523c9313abe1","title":"鏉冨織榫欍�佸お闃宠嫢涓嶄笌YG缁害锛屽皢涓嶈兘浣跨敤鑹哄悕锛岃繖鏄�滅粦鏋垛�濈画绾�","date":"2019-12-12 13:56","category":"澶存潯","author_name":"鏄熻寖鍎�","url":"http://mini.eastday.com/mobile/191212135655851.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20191212/2019121213_4aca275b49a24553900c5f70112f3c75_3304_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20191212/2019121213_63e90d9da00244789bb096c0444bd9a1_3273_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07imgmini.eastday.com/mobile/20191212/2019121213_1e4b7dc5154b41fe8da5cf411ec3664e_2355_mwpm_03200403.jpg"},{"uniquekey":"45f15e279975aa0727bc677a57a196c7","title":"璧簡锛佹箹浜鸿1浜哄張绛�1浜猴紒鐜板満鐖嗗彂鍐茬獊锛岄樋鏉滆椹遍�愶紒","date":"2019-12-12 13:55","category":"澶存潯","author_name":"瑭瑰鏂惂","url":"http://mini.eastday.com/mobile/191212135549891.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20191212/20191212135549_bf52cb4b29a4f4632f92f7868e15de91_13_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20191212/20191212135549_bf52cb4b29a4f4632f92f7868e15de91_14_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07imgmini.eastday.com/mobile/20191212/20191212135549_bf52cb4b29a4f4632f92f7868e15de91_6_mwpm_03200403.jpg"},{"uniquekey":"303194e3b71eba8aa01ed407e74ae550","title":"濂规湰鏄�婇潪璇氬嬁鎵般�嬩腑鐨勮浼楋紝鍥犱负闀垮緱濂借鍙戠幇锛屽浠婃垚涓烘紨鍛橈紒","date":"2019-12-12 13:53","category":"澶存潯","author_name":"褰╄櫣闆ㄦ淮","url":"http://mini.eastday.com/mobile/191212135341925.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20191212/20191212135341_891591053d0713abede5d389f974fde5_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04imgmini.eastday.com/mobile/20191212/20191212135341_891591053d0713abede5d389f974fde5_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04imgmini.eastday.com/mobile/20191212/20191212135341_891591053d0713abede5d389f974fde5_3_mwpm_03200403.jpg"},{"uniquekey":"3b77567cb71cd7ad419b04d1ecef80a9","title":"濂硅韩鐫�濠氱罕涓捐鐩涘ぇ濠氱ぜ 鈥滄柊閮庘�濆嵈鏄竴寮犲湴姣紵","date":"2019-12-12 13:51","category":"澶存潯","author_name":"涓浗鏂伴椈缃�","url":"http://mini.eastday.com/mobile/191212135145523.html","thumbnail_pic_s":"http://09imgmini.eastday.com/mobile/20191212/20191212135145_6143fa91558094f9483fb8de98d83460_1_mwpm_03200403.jpg"},{"uniquekey":"aae1cdc7dbc61d2cc3f67be26b175f45","title":"鍜忔鏅掔収绱犻涓嶉伄鎺╋紝閮戒笉婊�50宀侊紝鎬庝箞杩欎箞琛拌�佷簡锛�","date":"2019-12-12 13:50","category":"澶存潯","author_name":"鎸戞甯�","url":"http://mini.eastday.com/mobile/191212135028737.html","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20191212/20191212135028_dd19f4223526c80e9413f132e42bcf1e_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08imgmini.eastday.com/mobile/20191212/20191212135028_dd19f4223526c80e9413f132e42bcf1e_7_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08imgmini.eastday.com/mobile/20191212/20191212135028_dd19f4223526c80e9413f132e42bcf1e_5_mwpm_03200403.jpg"},{"uniquekey":"543116ffbee34fd3f4e4a0b9871b3fa6","title":"涓嶅鏄擄紒濡傛灉姹熻嫃鏃犵紭鍥涘己锛屽コ鎺掍竷浠欏コ灏嗗彧鏈夋湵濠锋湁鏈涘ず鑱旇禌鍐犲啗","date":"2019-12-12 13:50","category":"澶存潯","author_name":"鑰侀珮璇翠綋鑲�","url":"http://mini.eastday.com/mobile/191212135028732.html","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20191212/2019121213_304a703161064b698d27633893db8f4b_2017_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03imgmini.eastday.com/mobile/20191212/2019121213_24ecf1f83bb5458c95c0f9b220875f2f_1264_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03imgmini.eastday.com/mobile/20191212/2019121213_efc4155fbaa645038bc8da66b93f0ecf_3112_cover_mwpm_03200403.jpg"},{"uniquekey":"2c4f750e8b2e4a70f493a29da8e1a3a9","title":"椹竷閲岋細鏂殕浠婃櫄涓嶄細鍑烘垬锛岃帿閲屾柉鑵块儴鍔涢噺杈句笉鍒拌姹�","date":"2019-12-12 13:50","category":"澶存潯","author_name":"铏庢墤浣撹偛","url":"http://mini.eastday.com/mobile/191212135026111.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20191212/20191212135026_7225bdbb377df680b4d56a2bde2b1bf2_1_mwpm_03200403.jpg"},{"uniquekey":"e9e51eee7043440082c6335ae08c4827","title":"鍐ぉ瑕佸鍠濊繖涓堡锛岃惀鍏荤編鍛筹紝10鍏冭兘鍋氫竴澶ч攨锛屽叏瀹朵汉閮界埍鍠�","date":"2019-12-12 13:50","category":"澶存潯","author_name":"姗樺瓙濮愮編椋烼B","url":"http://mini.eastday.com/mobile/191212135023491.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20191212/20191212135023_0a3b9924e594f514ab0c2fc2520739c1_6_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20191212/20191212135023_0a3b9924e594f514ab0c2fc2520739c1_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06imgmini.eastday.com/mobile/20191212/20191212135023_0a3b9924e594f514ab0c2fc2520739c1_2_mwpm_03200403.jpg"},{"uniquekey":"9e572068a9031689d82afc5cde408d2d","title":"涓夊厓鐓や笟宸ヤ細寮�灞曡亴宸ヤ唬琛ㄥ贰瑙嗘椿鍔�","date":"2019-12-12 13:50","category":"澶存潯","author_name":"寰眰鐭ヨ��","url":"http://mini.eastday.com/mobile/191212135012669.html","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20191212/20191212135012_5cff4c1fc1bc2e1a6f488b3b94934f59_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01imgmini.eastday.com/mobile/20191212/20191212135012_5cff4c1fc1bc2e1a6f488b3b94934f59_1_mwpm_03200403.jpg"},{"uniquekey":"c369c1e629fa0931803515f7adbb2e07","title":"2019骞村害濂虫�у垱涓氳�匱OP10鍚嶅崟鍏竷锛孷PHOTO鍒涘浜烘浌鐜夋晱涓婃","date":"2019-12-12 13:48","category":"澶存潯","author_name":"娣辨墥璐㈢粡鍦�","url":"http://mini.eastday.com/mobile/191212134819905.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20191212/20191212134819_5b1508dc041075ce5488486934094fe6_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05imgmini.eastday.com/mobile/20191212/20191212134819_5b1508dc041075ce5488486934094fe6_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05imgmini.eastday.com/mobile/20191212/20191212134819_5b1508dc041075ce5488486934094fe6_3_mwpm_03200403.jpg"},{"uniquekey":"d6b09f42b1a94586dca1816ffc488b44","title":"鏇濆寳浜浗瀹夊拰鏂鎷夐噷璋堝穿鍐呭箷锛佸勾钖姹傝繃楂橈紝鏂竻鎯规伡鍥藉畨楂樺眰","date":"2019-12-12 13:48","category":"澶存潯","author_name":"鍛ㄤ匠楠�","url":"http://mini.eastday.com/mobile/191212134806845.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20191212/20191212134806_5563969f818233a28ea376ea148e2513_6_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20191212/20191212134806_5563969f818233a28ea376ea148e2513_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06imgmini.eastday.com/mobile/20191212/20191212134806_5563969f818233a28ea376ea148e2513_2_mwpm_03200403.jpg"},{"uniquekey":"db1427544eac515e6f38558920684b65","title":"濂冲瓙浣跨敤鍞囬儴濉厖鐗╁悗 鍢村攪閬囬珮娓╀細鍙樻垚鈥滈碂楸煎櫂鍢村瀷鈥�","date":"2019-12-12 13:45","category":"澶存潯","author_name":"鍖楅潚缃�","url":"http://mini.eastday.com/mobile/191212134519559.html","thumbnail_pic_s":"http://09imgmini.eastday.com/mobile/20191212/20191212134519_08ae8d1bcb498a26494f37cdfe7db61e_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09imgmini.eastday.com/mobile/20191212/20191212134519_08ae8d1bcb498a26494f37cdfe7db61e_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09imgmini.eastday.com/mobile/20191212/20191212134519_08ae8d1bcb498a26494f37cdfe7db61e_3_mwpm_03200403.jpg"},{"uniquekey":"c7aaa7dfdb1556126d7cb1220d4923b1","title":"1鏈堜笅鏃紝濮嬩簬蹇冨姩锛岄櫡浜庢繁鎯咃紝3鏄熷骇鍠滄彁鑹紭锛岀埍鎯呭渾婊�","date":"2019-12-12 13:44","category":"澶存潯","author_name":"鍥炬枃鑹虹敾","url":"http://mini.eastday.com/mobile/191212134400829.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20191212/20191212134400_ecb84e21822423c9dbe3a1530bb98319_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20191212/20191212134400_ecb84e21822423c9dbe3a1530bb98319_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06imgmini.eastday.com/mobile/20191212/20191212134400_ecb84e21822423c9dbe3a1530bb98319_1_mwpm_03200403.jpg"}]}
     * error_code : 0
     */

    private String reason;
    private ResultBean result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {
        /**
         * stat : 1
         * data : [{"uniquekey":"517163d86c9bd4d53fc2b117d27c99ed","title":"寮�蹇冧竴鍒伙細琛ㄥ摜鑺变簡濂藉嚑涓囪拷閰掑惂鏈嶅姟鍛橈紝杩樻槸琚嫆锛屽濡堣锛�500","date":"2019-12-12 14:27","category":"澶存潯","author_name":"骞介粯妗�","url":"http://mini.eastday.com/mobile/191212142749666.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20191212/20191212142749_de2c8c015ebd2d039f466f4089ccf0ab_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20191212/20191212142749_de2c8c015ebd2d039f466f4089ccf0ab_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06imgmini.eastday.com/mobile/20191212/20191212142749_de2c8c015ebd2d039f466f4089ccf0ab_4_mwpm_03200403.jpg"},{"uniquekey":"f9d1ba58378fc474d9479b04db83e756","title":"浜庡皬褰よ妭鐩腑璺熻枃钖囨悅鎼傛姳鎶憋紝褰撻暅澶存媺杩戝悗锛岄檲灏忕涵瑕佸け鎺т簡锛�","date":"2019-12-12 14:21","category":"澶存潯","author_name":"鐖嗙垎濞变箰鍦�","url":"http://mini.eastday.com/mobile/191212142107456.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20191212/20191212142107_32cdc6b48426c9b3adba035137b648d3_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20191212/20191212142107_32cdc6b48426c9b3adba035137b648d3_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20191212/20191212142107_32cdc6b48426c9b3adba035137b648d3_3_mwpm_03200403.jpg"},{"uniquekey":"c472a8a59ffb68d1b9a4f428ea46698f","title":"鈥滆倸閲忊�濇渶澶х殑娉曟媺鍒╋紒宸ㄥぇ鍏ㄩ�忔槑灏剧锛�40骞磋溅榫勫崠1700涓�","date":"2019-12-12 14:18","category":"澶存潯","author_name":"ZAKER缃�","url":"http://mini.eastday.com/mobile/191212141802779.html","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20191212/20191212141802_b3a59ced696d524d724700fce39df6a2_5_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03imgmini.eastday.com/mobile/20191212/20191212141802_b3a59ced696d524d724700fce39df6a2_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03imgmini.eastday.com/mobile/20191212/20191212141802_b3a59ced696d524d724700fce39df6a2_4_mwpm_03200403.jpg"},{"uniquekey":"a4acce1f16b68095f80b72a338330abe","title":"閮戞櫤鍙戦鏈夊鎭愭�栵紝鍥借冻灏忓皢鎯婂嚭涓�韬喎姹楋紝闃熷弸鎯婂憜浜�","date":"2019-12-12 14:16","category":"澶存潯","author_name":"ZAKER缃�","url":"http://mini.eastday.com/mobile/191212141617690.html","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20191212/20191212141617_433e78ca79287b15e1d54789516d9b7e_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08imgmini.eastday.com/mobile/20191212/20191212141617_433e78ca79287b15e1d54789516d9b7e_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08imgmini.eastday.com/mobile/20191212/20191212141617_433e78ca79287b15e1d54789516d9b7e_2_mwpm_03200403.jpg"},{"uniquekey":"407025c573576c697a557cc31df63a62","title":"鑺墖鍐嶅害浜戣捣浜戞秾锛屽叧娉≒CB娑ㄤ环姒傚康","date":"2019-12-12 14:15","category":"澶存潯","author_name":"閲戣瀺鑰佹暀鎺�","url":"http://mini.eastday.com/mobile/191212141510440.html","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20191212/20191212141510_f60372de86aacf12e5f0f5c2cbf0ef22_2_mwpm_03200403.jpg"},{"uniquekey":"b5f50c1b1e8c7df95fb730ebc8e8526f","title":"閭兏甯備粖骞村叏鍔涙彁鍗囦究姘戝競鍦哄缓璁炬按骞�","date":"2019-12-12 14:13","category":"澶存潯","author_name":"閭兏鏂伴椈缃�","url":"http://mini.eastday.com/mobile/191212141356925.html","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20191212/20191212141356_edaaa5fcbbad94494e442e7a8610006c_1_mwpm_03200403.jpg"},{"uniquekey":"b3c03608bb1ce604ec8f9bfcc5edbde0","title":"鍊Ξ澶у啲澶╃┛鏃犺偐闀胯 澶╅箙棰堝お浼樿秺 鍐峰埌绱ф彙鍙屾嫵缁х画寰瑧钀ヤ笟","date":"2019-12-12 14:13","category":"澶存潯","author_name":"鏄庢槦娆箰棰�","url":"http://mini.eastday.com/mobile/191212141341555.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20191212/20191212141341_0398f7d59e5ea138339e8cd1eccc0194_5_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20191212/20191212141341_0398f7d59e5ea138339e8cd1eccc0194_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06imgmini.eastday.com/mobile/20191212/20191212141341_0398f7d59e5ea138339e8cd1eccc0194_6_mwpm_03200403.jpg"},{"uniquekey":"64a0ac7fd0f5a66e428b7c42f20f4ce6","title":"鍐ぉ鏄編鐧界殑鈥滈粍閲戞湡鈥濓紝濂充汉闆锋墦涓嶅姩鍋氳繖3鐐癸紝鐨偆鍙堢櫧鍙堟按娑�","date":"2019-12-12 14:12","category":"澶存潯","author_name":"鎶よ偆灏忓姪鐞�","url":"http://mini.eastday.com/mobile/191212141241887.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20191212/20191212141241_9930fec87f6bc606553d20249cfe818c_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20191212/20191212141241_9930fec87f6bc606553d20249cfe818c_5_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07imgmini.eastday.com/mobile/20191212/20191212141241_9930fec87f6bc606553d20249cfe818c_7_mwpm_03200403.jpg"},{"uniquekey":"8efac69c64b249c08f97f4c0670207e8","title":"灞辫タ涓�涓绂佹缃戣喘鍙戠幇灏辨病鏀讹紝寰嬪笀锛氳琛屼负渚电姱瀛︾敓鏉冨埄","date":"2019-12-12 14:10","category":"澶存潯","author_name":"绾电浉鏂伴椈","url":"http://mini.eastday.com/mobile/191212141027147.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20191212/2019121214_d5297468750042cb94ef5ec303212eb0_9318_cover_mwpm_03200403.jpg"},{"uniquekey":"1433fab843ff3a27e5313f711578fa4f","title":"涓�缇ゅぇ鐧介波鍑虹幇鍦ㄧ編鍥芥捣宀� 鍏朵腑涓�鏉¤韩闀�15鑻卞昂銆佷綋閲�600鍏枻","date":"2019-12-12 14:07","category":"澶存潯","author_name":"鍖楅潚缃�","url":"http://mini.eastday.com/mobile/191212140754322.html","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20191212/20191212140754_06a27ca05b2115fba9aa2eb8b82b5da5_1_mwpm_03200403.jpg"},{"uniquekey":"26cf6d4f83e5dd9d3886caf86672c0fe","title":"浠栨槸缁冧範鐢熷嚭韬紝鑳藉敱鑳借烦杩樿兘涓婄患鑹猴紝濡備粖婕旀妧椋炶穬鍦堢矇鍦堜腑鍓嶈緢","date":"2019-12-12 14:06","category":"澶存潯","author_name":"鐧句箞瑗垮ū涔�","url":"http://mini.eastday.com/mobile/191212140632815.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20191212/2019121214_72c80c89715a47bf8d98127b601dbd7b_9601_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20191212/2019121214_993753871b25480996f4204fabc08494_0906_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07imgmini.eastday.com/mobile/20191212/2019121214_27f5ee076ad347c4a2a97238bd73aea3_9209_cover_mwpm_03200403.jpg"},{"uniquekey":"50ccd9ba18366cdd326b16404d37a1ac","title":"鐜嬭�呰崳鑰�锛氱帺瀹舵渶鏈熸湜纰庣墖鍟嗗簵涓婃灦鐨勭毊鑲わ紝鍗冨勾涔嬬嫄涓婃锛�","date":"2019-12-12 14:00","category":"澶存潯","author_name":"鐜嬭�呰崳鑰�瀹樼綉","url":"http://mini.eastday.com/mobile/191212140006504.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20191212/20191212140006_29d23a3bf234a5aa68f70383cbb52c66_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04imgmini.eastday.com/mobile/20191212/20191212140006_29d23a3bf234a5aa68f70383cbb52c66_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04imgmini.eastday.com/mobile/20191212/20191212140006_29d23a3bf234a5aa68f70383cbb52c66_2_mwpm_03200403.jpg"},{"uniquekey":"72a524e7f7e0f40d13d75e639e50c6e0","title":"32宀佸噯濡堝锛屾��瀛�30鍛紝鎰熸煋浜嗘垔鑲濓紝鍏跺師鍥狅細鈥滃鍗栤�濆彲鑳芥�ф渶澶�","date":"2019-12-12 14:00","category":"澶存潯","author_name":"瀵诲尰闂嵂缃�","url":"http://mini.eastday.com/mobile/191212140000455.html","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20191212/20191212140000_0f4e39a4573afa2dfd409639e3535f1f_1_mwpm_03200403.jpg"},{"uniquekey":"4eacdbf46ead4f6ffcde8f35a1636c69","title":"濡傛灉鍑虹幇杩�5绉嶇棁鐘朵箣涓�锛屽氨瑕佸皬蹇冧綋鍐呮湁琛�鏍撲簡","date":"2019-12-12 14:00","category":"澶存潯","author_name":"瀵诲尰闂嵂缃�","url":"http://mini.eastday.com/mobile/191212140000029.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20191212/20191212140000_b658fb6ad137fef2c1cf0e368fe49e91_1_mwpm_03200403.jpg"},{"uniquekey":"775e41410138368aacc374c48f773e60","title":"鎼炵瑧GIF:瀚傚瓙锛屼綘鑳戒笉鑳界粰澶у摜鐐归潰瀛愶紝鐩存挱鍛�","date":"2019-12-12 13:58","category":"澶存潯","author_name":"鎼炵瑧鐨勬瀛愮帇","url":"http://mini.eastday.com/mobile/191212135808539.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20191212/20191212135808_d169ffe84e44534456acd0c1b4a4c971_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20191212/20191212135808_d169ffe84e44534456acd0c1b4a4c971_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20191212/20191212135808_d169ffe84e44534456acd0c1b4a4c971_4_mwpm_03200403.jpg"},{"uniquekey":"4bb893dca22efdd69424a5c20d56556b","title":"澶х儹蹇呮锛佹鍐犺禂鐜囧嚭鐐夊紩浜夎锛氳繖鏀绉樹箣甯堝凡缁忊�滀笁杩炲啝鈥濅簡","date":"2019-12-12 13:58","category":"澶存潯","author_name":"ZAKER缃�","url":"http://mini.eastday.com/mobile/191212135808351.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20191212/20191212135808_df691751d1ea73de0c2884b624e7eb33_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02imgmini.eastday.com/mobile/20191212/20191212135808_df691751d1ea73de0c2884b624e7eb33_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02imgmini.eastday.com/mobile/20191212/20191212135808_df691751d1ea73de0c2884b624e7eb33_2_mwpm_03200403.jpg"},{"uniquekey":"795578336a6f6b886dbc279296ced610","title":"娴欐睙涓崡浠庡缓绛戣涓氬埌鍔ㄦ极琛屼笟鐨勮法棰嗗煙浜т笟鍗囩骇","date":"2019-12-12 13:58","category":"澶存潯","author_name":"浠婃棩涓摬","url":"http://mini.eastday.com/mobile/191212135804808.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20191212/20191212135804_57ec568a0315b025e9e016359109981b_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05imgmini.eastday.com/mobile/20191212/20191212135804_57ec568a0315b025e9e016359109981b_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05imgmini.eastday.com/mobile/20191212/20191212135804_57ec568a0315b025e9e016359109981b_1_mwpm_03200403.jpg"},{"uniquekey":"d4b22b77c30605c75ca8523c9313abe1","title":"鏉冨織榫欍�佸お闃宠嫢涓嶄笌YG缁害锛屽皢涓嶈兘浣跨敤鑹哄悕锛岃繖鏄�滅粦鏋垛�濈画绾�","date":"2019-12-12 13:56","category":"澶存潯","author_name":"鏄熻寖鍎�","url":"http://mini.eastday.com/mobile/191212135655851.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20191212/2019121213_4aca275b49a24553900c5f70112f3c75_3304_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20191212/2019121213_63e90d9da00244789bb096c0444bd9a1_3273_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07imgmini.eastday.com/mobile/20191212/2019121213_1e4b7dc5154b41fe8da5cf411ec3664e_2355_mwpm_03200403.jpg"},{"uniquekey":"45f15e279975aa0727bc677a57a196c7","title":"璧簡锛佹箹浜鸿1浜哄張绛�1浜猴紒鐜板満鐖嗗彂鍐茬獊锛岄樋鏉滆椹遍�愶紒","date":"2019-12-12 13:55","category":"澶存潯","author_name":"瑭瑰鏂惂","url":"http://mini.eastday.com/mobile/191212135549891.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20191212/20191212135549_bf52cb4b29a4f4632f92f7868e15de91_13_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20191212/20191212135549_bf52cb4b29a4f4632f92f7868e15de91_14_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07imgmini.eastday.com/mobile/20191212/20191212135549_bf52cb4b29a4f4632f92f7868e15de91_6_mwpm_03200403.jpg"},{"uniquekey":"303194e3b71eba8aa01ed407e74ae550","title":"濂规湰鏄�婇潪璇氬嬁鎵般�嬩腑鐨勮浼楋紝鍥犱负闀垮緱濂借鍙戠幇锛屽浠婃垚涓烘紨鍛橈紒","date":"2019-12-12 13:53","category":"澶存潯","author_name":"褰╄櫣闆ㄦ淮","url":"http://mini.eastday.com/mobile/191212135341925.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20191212/20191212135341_891591053d0713abede5d389f974fde5_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04imgmini.eastday.com/mobile/20191212/20191212135341_891591053d0713abede5d389f974fde5_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04imgmini.eastday.com/mobile/20191212/20191212135341_891591053d0713abede5d389f974fde5_3_mwpm_03200403.jpg"},{"uniquekey":"3b77567cb71cd7ad419b04d1ecef80a9","title":"濂硅韩鐫�濠氱罕涓捐鐩涘ぇ濠氱ぜ 鈥滄柊閮庘�濆嵈鏄竴寮犲湴姣紵","date":"2019-12-12 13:51","category":"澶存潯","author_name":"涓浗鏂伴椈缃�","url":"http://mini.eastday.com/mobile/191212135145523.html","thumbnail_pic_s":"http://09imgmini.eastday.com/mobile/20191212/20191212135145_6143fa91558094f9483fb8de98d83460_1_mwpm_03200403.jpg"},{"uniquekey":"aae1cdc7dbc61d2cc3f67be26b175f45","title":"鍜忔鏅掔収绱犻涓嶉伄鎺╋紝閮戒笉婊�50宀侊紝鎬庝箞杩欎箞琛拌�佷簡锛�","date":"2019-12-12 13:50","category":"澶存潯","author_name":"鎸戞甯�","url":"http://mini.eastday.com/mobile/191212135028737.html","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20191212/20191212135028_dd19f4223526c80e9413f132e42bcf1e_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08imgmini.eastday.com/mobile/20191212/20191212135028_dd19f4223526c80e9413f132e42bcf1e_7_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08imgmini.eastday.com/mobile/20191212/20191212135028_dd19f4223526c80e9413f132e42bcf1e_5_mwpm_03200403.jpg"},{"uniquekey":"543116ffbee34fd3f4e4a0b9871b3fa6","title":"涓嶅鏄擄紒濡傛灉姹熻嫃鏃犵紭鍥涘己锛屽コ鎺掍竷浠欏コ灏嗗彧鏈夋湵濠锋湁鏈涘ず鑱旇禌鍐犲啗","date":"2019-12-12 13:50","category":"澶存潯","author_name":"鑰侀珮璇翠綋鑲�","url":"http://mini.eastday.com/mobile/191212135028732.html","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20191212/2019121213_304a703161064b698d27633893db8f4b_2017_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03imgmini.eastday.com/mobile/20191212/2019121213_24ecf1f83bb5458c95c0f9b220875f2f_1264_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03imgmini.eastday.com/mobile/20191212/2019121213_efc4155fbaa645038bc8da66b93f0ecf_3112_cover_mwpm_03200403.jpg"},{"uniquekey":"2c4f750e8b2e4a70f493a29da8e1a3a9","title":"椹竷閲岋細鏂殕浠婃櫄涓嶄細鍑烘垬锛岃帿閲屾柉鑵块儴鍔涢噺杈句笉鍒拌姹�","date":"2019-12-12 13:50","category":"澶存潯","author_name":"铏庢墤浣撹偛","url":"http://mini.eastday.com/mobile/191212135026111.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20191212/20191212135026_7225bdbb377df680b4d56a2bde2b1bf2_1_mwpm_03200403.jpg"},{"uniquekey":"e9e51eee7043440082c6335ae08c4827","title":"鍐ぉ瑕佸鍠濊繖涓堡锛岃惀鍏荤編鍛筹紝10鍏冭兘鍋氫竴澶ч攨锛屽叏瀹朵汉閮界埍鍠�","date":"2019-12-12 13:50","category":"澶存潯","author_name":"姗樺瓙濮愮編椋烼B","url":"http://mini.eastday.com/mobile/191212135023491.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20191212/20191212135023_0a3b9924e594f514ab0c2fc2520739c1_6_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20191212/20191212135023_0a3b9924e594f514ab0c2fc2520739c1_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06imgmini.eastday.com/mobile/20191212/20191212135023_0a3b9924e594f514ab0c2fc2520739c1_2_mwpm_03200403.jpg"},{"uniquekey":"9e572068a9031689d82afc5cde408d2d","title":"涓夊厓鐓や笟宸ヤ細寮�灞曡亴宸ヤ唬琛ㄥ贰瑙嗘椿鍔�","date":"2019-12-12 13:50","category":"澶存潯","author_name":"寰眰鐭ヨ��","url":"http://mini.eastday.com/mobile/191212135012669.html","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20191212/20191212135012_5cff4c1fc1bc2e1a6f488b3b94934f59_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01imgmini.eastday.com/mobile/20191212/20191212135012_5cff4c1fc1bc2e1a6f488b3b94934f59_1_mwpm_03200403.jpg"},{"uniquekey":"c369c1e629fa0931803515f7adbb2e07","title":"2019骞村害濂虫�у垱涓氳�匱OP10鍚嶅崟鍏竷锛孷PHOTO鍒涘浜烘浌鐜夋晱涓婃","date":"2019-12-12 13:48","category":"澶存潯","author_name":"娣辨墥璐㈢粡鍦�","url":"http://mini.eastday.com/mobile/191212134819905.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20191212/20191212134819_5b1508dc041075ce5488486934094fe6_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05imgmini.eastday.com/mobile/20191212/20191212134819_5b1508dc041075ce5488486934094fe6_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05imgmini.eastday.com/mobile/20191212/20191212134819_5b1508dc041075ce5488486934094fe6_3_mwpm_03200403.jpg"},{"uniquekey":"d6b09f42b1a94586dca1816ffc488b44","title":"鏇濆寳浜浗瀹夊拰鏂鎷夐噷璋堝穿鍐呭箷锛佸勾钖姹傝繃楂橈紝鏂竻鎯规伡鍥藉畨楂樺眰","date":"2019-12-12 13:48","category":"澶存潯","author_name":"鍛ㄤ匠楠�","url":"http://mini.eastday.com/mobile/191212134806845.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20191212/20191212134806_5563969f818233a28ea376ea148e2513_6_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20191212/20191212134806_5563969f818233a28ea376ea148e2513_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06imgmini.eastday.com/mobile/20191212/20191212134806_5563969f818233a28ea376ea148e2513_2_mwpm_03200403.jpg"},{"uniquekey":"db1427544eac515e6f38558920684b65","title":"濂冲瓙浣跨敤鍞囬儴濉厖鐗╁悗 鍢村攪閬囬珮娓╀細鍙樻垚鈥滈碂楸煎櫂鍢村瀷鈥�","date":"2019-12-12 13:45","category":"澶存潯","author_name":"鍖楅潚缃�","url":"http://mini.eastday.com/mobile/191212134519559.html","thumbnail_pic_s":"http://09imgmini.eastday.com/mobile/20191212/20191212134519_08ae8d1bcb498a26494f37cdfe7db61e_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09imgmini.eastday.com/mobile/20191212/20191212134519_08ae8d1bcb498a26494f37cdfe7db61e_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09imgmini.eastday.com/mobile/20191212/20191212134519_08ae8d1bcb498a26494f37cdfe7db61e_3_mwpm_03200403.jpg"},{"uniquekey":"c7aaa7dfdb1556126d7cb1220d4923b1","title":"1鏈堜笅鏃紝濮嬩簬蹇冨姩锛岄櫡浜庢繁鎯咃紝3鏄熷骇鍠滄彁鑹紭锛岀埍鎯呭渾婊�","date":"2019-12-12 13:44","category":"澶存潯","author_name":"鍥炬枃鑹虹敾","url":"http://mini.eastday.com/mobile/191212134400829.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20191212/20191212134400_ecb84e21822423c9dbe3a1530bb98319_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20191212/20191212134400_ecb84e21822423c9dbe3a1530bb98319_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06imgmini.eastday.com/mobile/20191212/20191212134400_ecb84e21822423c9dbe3a1530bb98319_1_mwpm_03200403.jpg"}]
         */

        private String stat;
        private List<DataBean> data;

        public String getStat() {
            return stat;
        }

        public void setStat(String stat) {
            this.stat = stat;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }


        @Override
        public String toString() {
            return "ResultBean{" +
                    "stat='" + stat + '\'' +
                    ", data=" + data +
                    '}';
        }

        public static class DataBean {
            /**
             * uniquekey : 517163d86c9bd4d53fc2b117d27c99ed
             * title : 寮�蹇冧竴鍒伙細琛ㄥ摜鑺变簡濂藉嚑涓囪拷閰掑惂鏈嶅姟鍛橈紝杩樻槸琚嫆锛屽濡堣锛�500
             * date : 2019-12-12 14:27
             * category : 澶存潯
             * author_name : 骞介粯妗�
             * url : http://mini.eastday.com/mobile/191212142749666.html
             * thumbnail_pic_s : http://06imgmini.eastday.com/mobile/20191212/20191212142749_de2c8c015ebd2d039f466f4089ccf0ab_1_mwpm_03200403.jpg
             * thumbnail_pic_s02 : http://06imgmini.eastday.com/mobile/20191212/20191212142749_de2c8c015ebd2d039f466f4089ccf0ab_2_mwpm_03200403.jpg
             * thumbnail_pic_s03 : http://06imgmini.eastday.com/mobile/20191212/20191212142749_de2c8c015ebd2d039f466f4089ccf0ab_4_mwpm_03200403.jpg
             */

            private String uniquekey;
            private String title;
            private String date;
            private String category;
            private String author_name;
            private String url;
            private String thumbnail_pic_s;
            private String thumbnail_pic_s02;
            private String thumbnail_pic_s03;

            public String getUniquekey() {
                return uniquekey;
            }

            public void setUniquekey(String uniquekey) {
                this.uniquekey = uniquekey;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getAuthor_name() {
                return author_name;
            }

            public void setAuthor_name(String author_name) {
                this.author_name = author_name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getThumbnail_pic_s() {
                return thumbnail_pic_s;
            }

            public void setThumbnail_pic_s(String thumbnail_pic_s) {
                this.thumbnail_pic_s = thumbnail_pic_s;
            }

            public String getThumbnail_pic_s02() {
                return thumbnail_pic_s02;
            }

            public void setThumbnail_pic_s02(String thumbnail_pic_s02) {
                this.thumbnail_pic_s02 = thumbnail_pic_s02;
            }

            public String getThumbnail_pic_s03() {
                return thumbnail_pic_s03;
            }

            public void setThumbnail_pic_s03(String thumbnail_pic_s03) {
                this.thumbnail_pic_s03 = thumbnail_pic_s03;
            }

            @Override
            public String toString() {
                return "DataBean{" +
                        "uniquekey='" + uniquekey + '\'' +
                        ", title='" + title + '\'' +
                        ", date='" + date + '\'' +
                        ", category='" + category + '\'' +
                        ", author_name='" + author_name + '\'' +
                        ", url='" + url + '\'' +
                        ", thumbnail_pic_s='" + thumbnail_pic_s + '\'' +
                        ", thumbnail_pic_s02='" + thumbnail_pic_s02 + '\'' +
                        ", thumbnail_pic_s03='" + thumbnail_pic_s03 + '\'' +
                        '}';
            }
        }


    }

    @Override
    public String toString() {
        return "News{" +
                "reason='" + reason + '\'' +
                ", result=" + result +
                ", error_code=" + error_code +
                '}';
    }
}
