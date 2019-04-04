package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkValidationCacheEXT.html">khronos documentation</a>
 **/
public class VulkanValidationCacheEXT extends VulkanHandle {
    public VulkanValidationCacheEXT(){
        super(new VkValidationCacheEXT());
    }

    public VulkanValidationCacheEXT(VkValidationCacheEXT vk){
        super(vk);
    }

    @Override
    public VkValidationCacheEXT getVk(){
        return (VkValidationCacheEXT) super.getVk();
    }

    public VulkanValidationCacheEXT(int value){
        super(new VkValidationCacheEXT(value));
    }

    public static class Array extends VulkanValidationCacheEXT implements cz.mg.collections.array.ReadonlyArray<VulkanValidationCacheEXT> {
        public Array(VkValidationCacheEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkValidationCacheEXT.Array(count));
        }

        public Array(int count, VulkanValidationCacheEXT o){
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

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkValidationCacheEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkValidationCacheEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkValidationCacheEXT.Pointer(value));
        }

        @Override
        public VkValidationCacheEXT.Pointer getVk(){
            return (VkValidationCacheEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanValidationCacheEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanValidationCacheEXT.Pointer> {
            public Array(int count) {
                super(new VkValidationCacheEXT.Pointer.Array(count));
            }

            public Array(VulkanValidationCacheEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkValidationCacheEXT.Pointer.Array getVk(){
                return (VkValidationCacheEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanValidationCacheEXT.Pointer get(int i){
                return new VulkanValidationCacheEXT.Pointer(getVk().get(i));
            }
        }
    }
}
