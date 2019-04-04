package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkFenceImportFlagBits.html">khronos documentation</a>
 **/
public class VulkanFenceImportFlagBits extends VulkanFlagBits {
    public static final int TEMPORARY = VkFenceImportFlagBits.VK_FENCE_IMPORT_TEMPORARY_BIT;
    public static final int TEMPORARY_KHR = VkFenceImportFlagBits.VK_FENCE_IMPORT_TEMPORARY_BIT_KHR;

    public VulkanFenceImportFlagBits(){
        super(new VkFenceImportFlagBits());
    }

    public VulkanFenceImportFlagBits(VkFenceImportFlagBits vk){
        super(vk);
    }

    @Override
    public VkFenceImportFlagBits getVk(){
        return (VkFenceImportFlagBits) super.getVk();
    }

    public VulkanFenceImportFlagBits(int value){
        super(new VkFenceImportFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == TEMPORARY) s += "TEMPORARY";
        if(getValue() == TEMPORARY_KHR) s += "TEMPORARY_KHR";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VulkanFenceImportFlagBits implements cz.mg.collections.array.ReadonlyArray<VulkanFenceImportFlagBits> {
        public Array(VkFenceImportFlagBits.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkFenceImportFlagBits.Array(count));
        }

        public Array(int count, VulkanFenceImportFlagBits o){
            this(new VkFenceImportFlagBits.Array(count, o.getVk()));
        }

        @Override
        public VkFenceImportFlagBits.Array getVk(){
            return (VkFenceImportFlagBits.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanFenceImportFlagBits get(int i){
            return new VulkanFenceImportFlagBits(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkFenceImportFlagBits.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkFenceImportFlagBits.Pointer());
        }

        public Pointer(long value) {
            this(new VkFenceImportFlagBits.Pointer(value));
        }

        @Override
        public VkFenceImportFlagBits.Pointer getVk(){
            return (VkFenceImportFlagBits.Pointer) super.getVk();
        }

        public static class Array extends VulkanFenceImportFlagBits.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanFenceImportFlagBits.Pointer> {
            public Array(int count) {
                super(new VkFenceImportFlagBits.Pointer.Array(count));
            }

            public Array(VulkanFenceImportFlagBits[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkFenceImportFlagBits.Pointer.Array getVk(){
                return (VkFenceImportFlagBits.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanFenceImportFlagBits.Pointer get(int i){
                return new VulkanFenceImportFlagBits.Pointer(getVk().get(i));
            }
        }
    }
}
