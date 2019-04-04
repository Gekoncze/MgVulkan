package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkValidationCacheHeaderVersionEXT.html">khronos documentation</a>
 **/
public class VulkanValidationCacheHeaderVersionEXT extends VulkanEnum {
    public static final int VALIDATION_CACHE_HEADER_VERSION_ONE_EXT = VkValidationCacheHeaderVersionEXT.VK_VALIDATION_CACHE_HEADER_VERSION_ONE_EXT;

    public VulkanValidationCacheHeaderVersionEXT(){
        super(new VkValidationCacheHeaderVersionEXT());
    }

    public VulkanValidationCacheHeaderVersionEXT(VkValidationCacheHeaderVersionEXT vk){
        super(vk);
    }

    @Override
    public VkValidationCacheHeaderVersionEXT getVk(){
        return (VkValidationCacheHeaderVersionEXT) super.getVk();
    }

    public VulkanValidationCacheHeaderVersionEXT(int value){
        super(new VkValidationCacheHeaderVersionEXT(value));
    }

    @Override
    public String toString() {
        if(getValue() == VALIDATION_CACHE_HEADER_VERSION_ONE_EXT) return "VALIDATION_CACHE_HEADER_VERSION_ONE_EXT";
        return "UNKNOWN";
    }

    public static class Array extends VulkanValidationCacheHeaderVersionEXT implements cz.mg.collections.array.ReadonlyArray<VulkanValidationCacheHeaderVersionEXT> {
        public Array(VkValidationCacheHeaderVersionEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkValidationCacheHeaderVersionEXT.Array(count));
        }

        public Array(int count, VulkanValidationCacheHeaderVersionEXT o){
            this(new VkValidationCacheHeaderVersionEXT.Array(count, o.getVk()));
        }

        @Override
        public VkValidationCacheHeaderVersionEXT.Array getVk(){
            return (VkValidationCacheHeaderVersionEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanValidationCacheHeaderVersionEXT get(int i){
            return new VulkanValidationCacheHeaderVersionEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkValidationCacheHeaderVersionEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkValidationCacheHeaderVersionEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkValidationCacheHeaderVersionEXT.Pointer(value));
        }

        @Override
        public VkValidationCacheHeaderVersionEXT.Pointer getVk(){
            return (VkValidationCacheHeaderVersionEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanValidationCacheHeaderVersionEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanValidationCacheHeaderVersionEXT.Pointer> {
            public Array(int count) {
                super(new VkValidationCacheHeaderVersionEXT.Pointer.Array(count));
            }

            public Array(VulkanValidationCacheHeaderVersionEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkValidationCacheHeaderVersionEXT.Pointer.Array getVk(){
                return (VkValidationCacheHeaderVersionEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanValidationCacheHeaderVersionEXT.Pointer get(int i){
                return new VulkanValidationCacheHeaderVersionEXT.Pointer(getVk().get(i));
            }
        }
    }
}
