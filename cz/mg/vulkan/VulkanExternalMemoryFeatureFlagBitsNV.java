package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkExternalMemoryFeatureFlagBitsNV.html">khronos documentation</a>
 **/
public class VulkanExternalMemoryFeatureFlagBitsNV extends VulkanFlagBits {
    public static final int EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_NV = VkExternalMemoryFeatureFlagBitsNV.VK_EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT_NV;
    public static final int EXTERNAL_MEMORY_FEATURE_EXPORTABLE_NV = VkExternalMemoryFeatureFlagBitsNV.VK_EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT_NV;
    public static final int EXTERNAL_MEMORY_FEATURE_IMPORTABLE_NV = VkExternalMemoryFeatureFlagBitsNV.VK_EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT_NV;

    public VulkanExternalMemoryFeatureFlagBitsNV(){
        super(new VkExternalMemoryFeatureFlagBitsNV());
    }

    public VulkanExternalMemoryFeatureFlagBitsNV(VkExternalMemoryFeatureFlagBitsNV vk){
        super(vk);
    }

    @Override
    public VkExternalMemoryFeatureFlagBitsNV getVk(){
        return (VkExternalMemoryFeatureFlagBitsNV) super.getVk();
    }

    public VulkanExternalMemoryFeatureFlagBitsNV(int value){
        super(new VkExternalMemoryFeatureFlagBitsNV(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_NV) s += "EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_NV";
        if(getValue() == EXTERNAL_MEMORY_FEATURE_EXPORTABLE_NV) s += "EXTERNAL_MEMORY_FEATURE_EXPORTABLE_NV";
        if(getValue() == EXTERNAL_MEMORY_FEATURE_IMPORTABLE_NV) s += "EXTERNAL_MEMORY_FEATURE_IMPORTABLE_NV";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VulkanExternalMemoryFeatureFlagBitsNV implements cz.mg.collections.array.ReadonlyArray<VulkanExternalMemoryFeatureFlagBitsNV> {
        public Array(VkExternalMemoryFeatureFlagBitsNV.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkExternalMemoryFeatureFlagBitsNV.Array(count));
        }

        public Array(int count, VulkanExternalMemoryFeatureFlagBitsNV o){
            this(new VkExternalMemoryFeatureFlagBitsNV.Array(count, o.getVk()));
        }

        @Override
        public VkExternalMemoryFeatureFlagBitsNV.Array getVk(){
            return (VkExternalMemoryFeatureFlagBitsNV.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanExternalMemoryFeatureFlagBitsNV get(int i){
            return new VulkanExternalMemoryFeatureFlagBitsNV(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkExternalMemoryFeatureFlagBitsNV.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkExternalMemoryFeatureFlagBitsNV.Pointer());
        }

        public Pointer(long value) {
            this(new VkExternalMemoryFeatureFlagBitsNV.Pointer(value));
        }

        @Override
        public VkExternalMemoryFeatureFlagBitsNV.Pointer getVk(){
            return (VkExternalMemoryFeatureFlagBitsNV.Pointer) super.getVk();
        }

        public static class Array extends VulkanExternalMemoryFeatureFlagBitsNV.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanExternalMemoryFeatureFlagBitsNV.Pointer> {
            public Array(int count) {
                super(new VkExternalMemoryFeatureFlagBitsNV.Pointer.Array(count));
            }

            public Array(VulkanExternalMemoryFeatureFlagBitsNV[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkExternalMemoryFeatureFlagBitsNV.Pointer.Array getVk(){
                return (VkExternalMemoryFeatureFlagBitsNV.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanExternalMemoryFeatureFlagBitsNV.Pointer get(int i){
                return new VulkanExternalMemoryFeatureFlagBitsNV.Pointer(getVk().get(i));
            }
        }
    }
}
