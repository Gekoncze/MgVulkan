package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanObjectTableNVX extends VulkanHandle {
    VulkanObjectTableNVX(){
        super(new VkObjectTableNVX());
    }

    VulkanObjectTableNVX(VkObjectTableNVX vk){
        super(vk);
    }

    @Override
    public VkObjectTableNVX getVk(){
        return (VkObjectTableNVX) super.getVk();
    }




    public static class Array extends VulkanObjectTableNVX implements cz.mg.collections.array.ReadonlyArray<VulkanObjectTableNVX> {
        Array(VkObjectTableNVX.Array a) {
            super(a);
        }

        Array(int count) {
            this(new VkObjectTableNVX.Array(count));
        }

        Array(int count, VulkanObjectTableNVX o){
            this(new VkObjectTableNVX.Array(count, o.getVk()));
        }

        @Override
        public VkObjectTableNVX.Array getVk(){
            return (VkObjectTableNVX.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanObjectTableNVX get(int i){
            return new VulkanObjectTableNVX(getVk().get(i));
        }
    }

}
