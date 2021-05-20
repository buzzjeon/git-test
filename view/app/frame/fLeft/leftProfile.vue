<template>
    <div id="left-profile">
        <img class="left-profile__pic" :src="picUrl"
            :class="{'left-profile__pic--disable':!profileUrl}"/>
        <div class="left-profile__name"
            :class="{'left-profile__name--disable':!userName}">{{userName||'No user'}}</div>
        <div class="left-profile__info"
            :class="{'left-profile__info--disable':!someInfo}">{{someInfo}}</div>
    </div>
</template>

<script>
export default {
    name:'left-profile',
    data:function(){return{
        userName   : '',
        someInfo   : '',
        profileUrl : ''
    }},
    computed:{
        picUrl : function() {
            let picUrl = this.profileUrl;
            if( !picUrl ) return require('@image/cat/catlion.jpg');
            return picUrl;
        }
    }
}
</script>

<style scoped lang="scss">
@import '@style/color.scss';
$image-size : 50px;
$back-disable : $col-gray-l2;

#left-profile {height:75px;margin-top:5px;position:relative;border-bottom:1px solid #aaa;}
.left-profile__pic,
.left-profile__name,
.left-profile__info {position:absolute;}
.left-profile__pic  {top:10px;left:10px;width:$image-size;height:$image-size;border-radius:$image-size;}
.left-profile__name {top:10px;left:70px;width:150px;height:25px;line-height:25px;padding-left:5px;}
.left-profile__info {top:40px;left:70px;width:100px;height:20px;line-height:20px;padding-left:5px;}
.left-profile__pic--disable {filter:grayscale(80%);}
.left-profile__name--disable,
.left-profile__info--disable {background:$col-gray-l2;color:$col-gray;}
</style>