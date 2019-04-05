package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanValidationCacheEXT extends VulkanHandle {
    VulkanValidationCacheEXT(){
        super(new VkValidationCacheEXT());
    }

    VulkanValidationCacheEXT(VkValidationCacheEXT vk){
        super(vk);
    }

    @Override
    public VkValidationCacheEXT getVk(){
        return (VkValidationCacheEXT) super.getVk();
    }




    public static class Array extends VulkanValidationCacheEXT implements cz.mg.collections.array.ReadonlyArray<VulkanValidationCacheEXT> {
        Array(VkValidationCacheEXT.Array a) {
            super(a);
        }

        Array(int count) {
            this(new VkValidationCacheEXT.Array(count));
        }

        Array(int count, VulkanValidationCacheEXT o){
            this(new VkValidationCacheEXT.Array(count, o.getVk()));
        }

        @Override
        public VkValidationCacheEXT.Array getVk(){
            return (VkValidationCacheEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanValidationCacheEXT get(int i){
            return new VulkanValidationCacheEXT(getVk().get(i));
        }
    }

}
