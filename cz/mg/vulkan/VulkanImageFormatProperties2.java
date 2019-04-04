package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkImageFormatProperties2.html">khronos documentation</a>
 **/
public class VulkanImageFormatProperties2 extends VulkanObject {
    public VulkanImageFormatProperties2(){
        super(new VkImageFormatProperties2());
    }

    public VulkanImageFormatProperties2(VkImageFormatProperties2 vk){
        super(vk);
    }

    @Override
    public VkImageFormatProperties2 getVk(){
        return (VkImageFormatProperties2) super.getVk();
    }

    public VulkanImageFormatProperties2(VulkanStructureType sType, VulkanObject pNext, VulkanImageFormatProperties imageFormatProperties) {
        super(new VkImageFormatProperties2(sType.getVk(), pNext.getVk(), imageFormatProperties.getVk()));
    }

    public VulkanStructureType getSType() {
        return new VulkanStructureType(getVk().getSType());
    }

    public void setSType(VulkanStructureType sType) {
        getVk().setSType(sType.getVk());
    }

    public VulkanObject getPNext() {
        return new VulkanObject(getVk().getPNext());
    }

    public void setPNext(VulkanObject pNext) {
        getVk().setPNext(pNext.getVk());
    }

    public VulkanImageFormatProperties getImageFormatProperties() {
        return new VulkanImageFormatProperties(getVk().getImageFormatProperties());
    }

    public void setImageFormatProperties(VulkanImageFormatProperties imageFormatProperties) {
        getVk().setImageFormatProperties(imageFormatProperties.getVk());
    }


    public static class Array extends VulkanImageFormatProperties2 implements cz.mg.collections.array.ReadonlyArray<VulkanImageFormatProperties2> {
        public Array(VkImageFormatProperties2.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkImageFormatProperties2.Array(count));
        }

        public Array(int count, VulkanImageFormatProperties2 o){
            this(new VkImageFormatProperties2.Array(count, o.getVk()));
        }

        @Override
        public VkImageFormatProperties2.Array getVk(){
            return (VkImageFormatProperties2.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanImageFormatProperties2 get(int i){
            return new VulkanImageFormatProperties2(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkImageFormatProperties2.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkImageFormatProperties2.Pointer());
        }

        public Pointer(long value) {
            this(new VkImageFormatProperties2.Pointer(value));
        }

        @Override
        public VkImageFormatProperties2.Pointer getVk(){
            return (VkImageFormatProperties2.Pointer) super.getVk();
        }

        public static class Array extends VulkanImageFormatProperties2.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanImageFormatProperties2.Pointer> {
            public Array(int count) {
                super(new VkImageFormatProperties2.Pointer.Array(count));
            }

            public Array(VulkanImageFormatProperties2[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkImageFormatProperties2.Pointer.Array getVk(){
                return (VkImageFormatProperties2.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanImageFormatProperties2.Pointer get(int i){
                return new VulkanImageFormatProperties2.Pointer(getVk().get(i));
            }
        }
    }
}
