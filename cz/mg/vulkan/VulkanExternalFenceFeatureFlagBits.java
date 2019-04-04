package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkExternalFenceFeatureFlagBits.html">khronos documentation</a>
 **/
public class VulkanExternalFenceFeatureFlagBits extends VulkanFlagBits {
    public static final int EXPORTABLE = VkExternalFenceFeatureFlagBits.VK_EXTERNAL_FENCE_FEATURE_EXPORTABLE_BIT;
    public static final int IMPORTABLE = VkExternalFenceFeatureFlagBits.VK_EXTERNAL_FENCE_FEATURE_IMPORTABLE_BIT;
    public static final int EXPORTABLE_KHR = VkExternalFenceFeatureFlagBits.VK_EXTERNAL_FENCE_FEATURE_EXPORTABLE_BIT_KHR;
    public static final int IMPORTABLE_KHR = VkExternalFenceFeatureFlagBits.VK_EXTERNAL_FENCE_FEATURE_IMPORTABLE_BIT_KHR;

    public VulkanExternalFenceFeatureFlagBits(){
        super(new VkExternalFenceFeatureFlagBits());
    }

    public VulkanExternalFenceFeatureFlagBits(VkExternalFenceFeatureFlagBits vk){
        super(vk);
    }

    @Override
    public VkExternalFenceFeatureFlagBits getVk(){
        return (VkExternalFenceFeatureFlagBits) super.getVk();
    }

    public VulkanExternalFenceFeatureFlagBits(int value){
        super(new VkExternalFenceFeatureFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == EXPORTABLE) s += "EXPORTABLE";
        if(getValue() == IMPORTABLE) s += "IMPORTABLE";
        if(getValue() == EXPORTABLE_KHR) s += "EXPORTABLE_KHR";
        if(getValue() == IMPORTABLE_KHR) s += "IMPORTABLE_KHR";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VulkanExternalFenceFeatureFlagBits implements cz.mg.collections.array.ReadonlyArray<VulkanExternalFenceFeatureFlagBits> {
        public Array(VkExternalFenceFeatureFlagBits.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkExternalFenceFeatureFlagBits.Array(count));
        }

        public Array(int count, VulkanExternalFenceFeatureFlagBits o){
            this(new VkExternalFenceFeatureFlagBits.Array(count, o.getVk()));
        }

        @Override
        public VkExternalFenceFeatureFlagBits.Array getVk(){
            return (VkExternalFenceFeatureFlagBits.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanExternalFenceFeatureFlagBits get(int i){
            return new VulkanExternalFenceFeatureFlagBits(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkExternalFenceFeatureFlagBits.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkExternalFenceFeatureFlagBits.Pointer());
        }

        public Pointer(long value) {
            this(new VkExternalFenceFeatureFlagBits.Pointer(value));
        }

        @Override
        public VkExternalFenceFeatureFlagBits.Pointer getVk(){
            return (VkExternalFenceFeatureFlagBits.Pointer) super.getVk();
        }

        public static class Array extends VulkanExternalFenceFeatureFlagBits.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanExternalFenceFeatureFlagBits.Pointer> {
            public Array(int count) {
                super(new VkExternalFenceFeatureFlagBits.Pointer.Array(count));
            }

            public Array(VulkanExternalFenceFeatureFlagBits[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkExternalFenceFeatureFlagBits.Pointer.Array getVk(){
                return (VkExternalFenceFeatureFlagBits.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanExternalFenceFeatureFlagBits.Pointer get(int i){
                return new VulkanExternalFenceFeatureFlagBits.Pointer(getVk().get(i));
            }
        }
    }
}
