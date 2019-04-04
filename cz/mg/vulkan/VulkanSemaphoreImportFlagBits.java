package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSemaphoreImportFlagBits.html">khronos documentation</a>
 **/
public class VulkanSemaphoreImportFlagBits extends VulkanFlagBits {
    public static final int TEMPORARY = VkSemaphoreImportFlagBits.VK_SEMAPHORE_IMPORT_TEMPORARY_BIT;
    public static final int TEMPORARY_KHR = VkSemaphoreImportFlagBits.VK_SEMAPHORE_IMPORT_TEMPORARY_BIT_KHR;

    public VulkanSemaphoreImportFlagBits(){
        super(new VkSemaphoreImportFlagBits());
    }

    public VulkanSemaphoreImportFlagBits(VkSemaphoreImportFlagBits vk){
        super(vk);
    }

    @Override
    public VkSemaphoreImportFlagBits getVk(){
        return (VkSemaphoreImportFlagBits) super.getVk();
    }

    public VulkanSemaphoreImportFlagBits(int value){
        super(new VkSemaphoreImportFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == TEMPORARY) s += "TEMPORARY";
        if(getValue() == TEMPORARY_KHR) s += "TEMPORARY_KHR";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VulkanSemaphoreImportFlagBits implements cz.mg.collections.array.ReadonlyArray<VulkanSemaphoreImportFlagBits> {
        public Array(VkSemaphoreImportFlagBits.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkSemaphoreImportFlagBits.Array(count));
        }

        public Array(int count, VulkanSemaphoreImportFlagBits o){
            this(new VkSemaphoreImportFlagBits.Array(count, o.getVk()));
        }

        @Override
        public VkSemaphoreImportFlagBits.Array getVk(){
            return (VkSemaphoreImportFlagBits.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSemaphoreImportFlagBits get(int i){
            return new VulkanSemaphoreImportFlagBits(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkSemaphoreImportFlagBits.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkSemaphoreImportFlagBits.Pointer());
        }

        public Pointer(long value) {
            this(new VkSemaphoreImportFlagBits.Pointer(value));
        }

        @Override
        public VkSemaphoreImportFlagBits.Pointer getVk(){
            return (VkSemaphoreImportFlagBits.Pointer) super.getVk();
        }

        public static class Array extends VulkanSemaphoreImportFlagBits.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanSemaphoreImportFlagBits.Pointer> {
            public Array(int count) {
                super(new VkSemaphoreImportFlagBits.Pointer.Array(count));
            }

            public Array(VulkanSemaphoreImportFlagBits[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkSemaphoreImportFlagBits.Pointer.Array getVk(){
                return (VkSemaphoreImportFlagBits.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanSemaphoreImportFlagBits.Pointer get(int i){
                return new VulkanSemaphoreImportFlagBits.Pointer(getVk().get(i));
            }
        }
    }
}
