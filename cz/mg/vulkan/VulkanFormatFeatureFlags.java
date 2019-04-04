package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkFormatFeatureFlags.html">khronos documentation</a>
 **/
public class VulkanFormatFeatureFlags extends VulkanFlags {
    public VulkanFormatFeatureFlags(){
        super(new VkFormatFeatureFlags());
    }

    public VulkanFormatFeatureFlags(VkFormatFeatureFlags vk){
        super(vk);
    }

    @Override
    public VkFormatFeatureFlags getVk(){
        return (VkFormatFeatureFlags) super.getVk();
    }

    public VulkanFormatFeatureFlags(int value){
        super(new VkFormatFeatureFlags(value));
    }

    public static class Array extends VulkanFormatFeatureFlags implements cz.mg.collections.array.ReadonlyArray<VulkanFormatFeatureFlags> {
        public Array(VkFormatFeatureFlags.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkFormatFeatureFlags.Array(count));
        }

        public Array(int count, VulkanFormatFeatureFlags o){
            this(new VkFormatFeatureFlags.Array(count, o.getVk()));
        }

        @Override
        public VkFormatFeatureFlags.Array getVk(){
            return (VkFormatFeatureFlags.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanFormatFeatureFlags get(int i){
            return new VulkanFormatFeatureFlags(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkFormatFeatureFlags.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkFormatFeatureFlags.Pointer());
        }

        public Pointer(long value) {
            this(new VkFormatFeatureFlags.Pointer(value));
        }

        @Override
        public VkFormatFeatureFlags.Pointer getVk(){
            return (VkFormatFeatureFlags.Pointer) super.getVk();
        }

        public static class Array extends VulkanFormatFeatureFlags.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanFormatFeatureFlags.Pointer> {
            public Array(int count) {
                super(new VkFormatFeatureFlags.Pointer.Array(count));
            }

            public Array(VulkanFormatFeatureFlags[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkFormatFeatureFlags.Pointer.Array getVk(){
                return (VkFormatFeatureFlags.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanFormatFeatureFlags.Pointer get(int i){
                return new VulkanFormatFeatureFlags.Pointer(getVk().get(i));
            }
        }
    }
}
