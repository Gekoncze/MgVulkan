package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanImageView extends VulkanHandle {
    VulkanImageView(){
        super(new VkImageView());
    }

    VulkanImageView(VkImageView vk){
        super(vk);
    }

    @Override
    public VkImageView getVk(){
        return (VkImageView) super.getVk();
    }




    public static class Array extends VulkanImageView implements cz.mg.collections.array.ReadonlyArray<VulkanImageView> {
        Array(VkImageView.Array a) {
            super(a);
        }

        Array(int count) {
            this(new VkImageView.Array(count));
        }

        Array(int count, VulkanImageView o){
            this(new VkImageView.Array(count, o.getVk()));
        }

        @Override
        public VkImageView.Array getVk(){
            return (VkImageView.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanImageView get(int i){
            return new VulkanImageView(getVk().get(i));
        }
    }

}
