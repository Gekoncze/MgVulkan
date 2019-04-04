package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkValidationCacheCreateFlagsEXT.html">khronos documentation</a>
 **/
public class VulkanValidationCacheCreateFlagsEXT extends VulkanFlags {
    public VulkanValidationCacheCreateFlagsEXT(){
        super(new VkValidationCacheCreateFlagsEXT());
    }

    public VulkanValidationCacheCreateFlagsEXT(VkValidationCacheCreateFlagsEXT vk){
        super(vk);
    }

    @Override
    public VkValidationCacheCreateFlagsEXT getVk(){
        return (VkValidationCacheCreateFlagsEXT) super.getVk();
    }

    public VulkanValidationCacheCreateFlagsEXT(int value){
        super(new VkValidationCacheCreateFlagsEXT(value));
    }

    public static class Array extends VulkanValidationCacheCreateFlagsEXT implements cz.mg.collections.array.ReadonlyArray<VulkanValidationCacheCreateFlagsEXT> {
        public Array(VkValidationCacheCreateFlagsEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkValidationCacheCreateFlagsEXT.Array(count));
        }

        public Array(int count, VulkanValidationCacheCreateFlagsEXT o){
            this(new VkValidationCacheCreateFlagsEXT.Array(count, o.getVk()));
        }

        @Override
        public VkValidationCacheCreateFlagsEXT.Array getVk(){
            return (VkValidationCacheCreateFlagsEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanValidationCacheCreateFlagsEXT get(int i){
            return new VulkanValidationCacheCreateFlagsEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkValidationCacheCreateFlagsEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkValidationCacheCreateFlagsEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkValidationCacheCreateFlagsEXT.Pointer(value));
        }

        @Override
        public VkValidationCacheCreateFlagsEXT.Pointer getVk(){
            return (VkValidationCacheCreateFlagsEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanValidationCacheCreateFlagsEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanValidationCacheCreateFlagsEXT.Pointer> {
            public Array(int count) {
                super(new VkValidationCacheCreateFlagsEXT.Pointer.Array(count));
            }

            public Array(VulkanValidationCacheCreateFlagsEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkValidationCacheCreateFlagsEXT.Pointer.Array getVk(){
                return (VkValidationCacheCreateFlagsEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanValidationCacheCreateFlagsEXT.Pointer get(int i){
                return new VulkanValidationCacheCreateFlagsEXT.Pointer(getVk().get(i));
            }
        }
    }
}
