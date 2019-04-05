package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanImage extends VulkanHandle {
    VulkanImage(){
        super(new VkImage());
    }

    VulkanImage(VkImage vk){
        super(vk);
    }

    @Override
    public VkImage getVk(){
        return (VkImage) super.getVk();
    }




    public static class Array extends VulkanImage implements cz.mg.collections.array.ReadonlyArray<VulkanImage> {
        Array(VkImage.Array a) {
            super(a);
        }

        Array(int count) {
            this(new VkImage.Array(count));
        }

        Array(int count, VulkanImage o){
            this(new VkImage.Array(count, o.getVk()));
        }

        @Override
        public VkImage.Array getVk(){
            return (VkImage.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanImage get(int i){
            return new VulkanImage(getVk().get(i));
        }
    }

}
