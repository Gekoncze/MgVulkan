package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkExternalSemaphoreFeatureFlagBits.html">khronos documentation</a>
 **/
public class VulkanExternalSemaphoreFeatureFlagBits extends VulkanFlagBits {
    public static final int EXPORTABLE = VkExternalSemaphoreFeatureFlagBits.VK_EXTERNAL_SEMAPHORE_FEATURE_EXPORTABLE_BIT;
    public static final int IMPORTABLE = VkExternalSemaphoreFeatureFlagBits.VK_EXTERNAL_SEMAPHORE_FEATURE_IMPORTABLE_BIT;
    public static final int EXPORTABLE_KHR = VkExternalSemaphoreFeatureFlagBits.VK_EXTERNAL_SEMAPHORE_FEATURE_EXPORTABLE_BIT_KHR;
    public static final int IMPORTABLE_KHR = VkExternalSemaphoreFeatureFlagBits.VK_EXTERNAL_SEMAPHORE_FEATURE_IMPORTABLE_BIT_KHR;

    public VulkanExternalSemaphoreFeatureFlagBits(){
        super(new VkExternalSemaphoreFeatureFlagBits());
    }

    public VulkanExternalSemaphoreFeatureFlagBits(VkExternalSemaphoreFeatureFlagBits vk){
        super(vk);
    }

    @Override
    public VkExternalSemaphoreFeatureFlagBits getVk(){
        return (VkExternalSemaphoreFeatureFlagBits) super.getVk();
    }

    public VulkanExternalSemaphoreFeatureFlagBits(int value){
        super(new VkExternalSemaphoreFeatureFlagBits(value));
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

    public static class Array extends VulkanExternalSemaphoreFeatureFlagBits implements cz.mg.collections.array.ReadonlyArray<VulkanExternalSemaphoreFeatureFlagBits> {
        public Array(VkExternalSemaphoreFeatureFlagBits.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkExternalSemaphoreFeatureFlagBits.Array(count));
        }

        public Array(int count, VulkanExternalSemaphoreFeatureFlagBits o){
            this(new VkExternalSemaphoreFeatureFlagBits.Array(count, o.getVk()));
        }

        @Override
        public VkExternalSemaphoreFeatureFlagBits.Array getVk(){
            return (VkExternalSemaphoreFeatureFlagBits.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanExternalSemaphoreFeatureFlagBits get(int i){
            return new VulkanExternalSemaphoreFeatureFlagBits(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkExternalSemaphoreFeatureFlagBits.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkExternalSemaphoreFeatureFlagBits.Pointer());
        }

        public Pointer(long value) {
            this(new VkExternalSemaphoreFeatureFlagBits.Pointer(value));
        }

        @Override
        public VkExternalSemaphoreFeatureFlagBits.Pointer getVk(){
            return (VkExternalSemaphoreFeatureFlagBits.Pointer) super.getVk();
        }

        public static class Array extends VulkanExternalSemaphoreFeatureFlagBits.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanExternalSemaphoreFeatureFlagBits.Pointer> {
            public Array(int count) {
                super(new VkExternalSemaphoreFeatureFlagBits.Pointer.Array(count));
            }

            public Array(VulkanExternalSemaphoreFeatureFlagBits[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkExternalSemaphoreFeatureFlagBits.Pointer.Array getVk(){
                return (VkExternalSemaphoreFeatureFlagBits.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanExternalSemaphoreFeatureFlagBits.Pointer get(int i){
                return new VulkanExternalSemaphoreFeatureFlagBits.Pointer(getVk().get(i));
            }
        }
    }
}
