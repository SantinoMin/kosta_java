//package SocialLoginEx.domain.controller;
//
//public class InfluencerEx {
//
//
//  public List<Influencer> getAllInfluencersWithDetails() {
//    List<Influencer> influencers = influencerRepository.findAll();
//
//    // 각 인플루언서에 대해 채널과 카테고리 정보를 가져옴
//    influencers.forEach(influencer -> {
//      List<Channel> channels = channelRepository.findByInfluencerId(influencer.getId());
//      List<Category> categories = categoryRepository.findByInfluencerId(influencer.getId());
//
//      influencer.setChannels(channels);
//      influencer.setCategories(categories);
//    });
//
//    return influencers;
//  }
//
//
//}
