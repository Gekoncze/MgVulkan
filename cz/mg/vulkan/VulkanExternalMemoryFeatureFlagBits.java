package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkExternalMemoryFeatureFlagBits.html">khronos documentation</a>
 **/
public class VulkanExternalMemoryFeatureFlagBits extends VulkanFlagBits {
    public static final int DEDICATED_ONLY = VkExternalMemoryFeatureFlagBits.VK_EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT;
    public static final int EXPORTABLE = VkExternalMemoryFeatureFlagBits.VK_EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT;
    public static final int IMPORTABLE = VkExternalMemoryFeatureFlagBits.VK_EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT;
    public static final int DEDICATED_ONLY_KHR = VkExternalMemoryFeatureFlagBits.VK_EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT_KHR;
    public static final int EXPORTABLE_KHR = VkExternalMemoryFeatureFlagBits.VK_EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT_KHR;
    public static final int IMPORTABLE_KHR = VkExternalMemoryFeatureFlagBits.VK_EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT_KHR;

    public VulkanExternalMemoryFeatureFlagBits(){
        super(new VkExternalMemoryFeatureFlagBits());
    }

    public VulkanExternalMemoryFeatureFlagBits(VkExternalMemoryFeatureFlagBits vk){
        super(vk);
    }

    @Override
    public VkExternalMemoryFeatureFlagBits getVk(){
        return (VkExternalMemoryFeatureFlagBits) super.getVk();
    }

    public VulkanExternalMemoryFeatureFlagBits(int value){
        super(new VkExternalMemoryFeatureFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == DEDICATED_ONLY) s += "DEDICATED_ONLY";
        if(getValue() == EXPORTABLE) s += "EXPORTABLE";
        if(getValue() == IMPORTABLE) s += "IMPORTABLE";
        if(getValue() == DEDICATED_ONLY_KHR) s += "DEDICATED_ONLY_KHR";
        if(getValue() == EXPORTABLE_KHR) s += "EXPORTABLE_KHR";
        if(getValue() == IMPORTABLE_KHR) s += "IMPORTABLE_KHR";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VulkanExternalMemoryFeatureFlagBits implements cz.mg.collections.array.ReadonlyArray<VulkanExternalMemoryFeatureFlagBits> {
        public Array(VkExternalMemoryFeatureFlagBits.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkExternalMemoryFeatureFlagBits.Array(count));
        }

        public Array(int count, VulkanExternalMemoryFeatureFlagBits o){
            this(new VkExternalMemoryFeatureFlagBits.Array(count, o.getVk()));
        }

        @Override
        public VkExternalMemoryFeatureFlagBits.Array getVk(){
            return (VkExternalMemoryFeatureFlagBits.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanExternalMemoryFeatureFlagBits get(int i){
            return new VulkanExternalMemoryFeatureFlagBits(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkExternalMemoryFeatureFlagBits.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkExternalMemoryFeatureFlagBits.Pointer());
        }

        public Pointer(long value) {
            this(new VkExternalMemoryFeatureFlagBits.Pointer(value));
        }

        @Override
        public VkExternalMemoryFeatureFlagBits.Pointer getVk(){
            return (VkExternalMemoryFeatureFlagBits.Pointer) super.getVk();
        }

        public static class Array extends VulkanExternalMemoryFeatureFlagBits.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanExternalMemoryFeatureFlagBits.Pointer> {
            public Array(int count) {
                super(new VkExternalMemoryFeatureFlagBits.Pointer.Array(count));
            }

            public Array(VulkanExternalMemoryFeatureFlagBits[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkExternalMemoryFeatureFlagBits.Pointer.Array getVk(){
                return (VkExternalMemoryFeatureFlagBits.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanExternalMemoryFeatureFlagBits.Pointer get(int i){
                return new VulkanExternalMemoryFeatureFlagBits.Pointer(getVk().get(i));
            }
        }
    }
}
