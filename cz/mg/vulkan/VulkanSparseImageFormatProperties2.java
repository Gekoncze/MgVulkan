package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSparseImageFormatProperties2.html">khronos documentation</a>
 **/
public class VulkanSparseImageFormatProperties2 extends VulkanObject {
    public VulkanSparseImageFormatProperties2(){
        super(new VkSparseImageFormatProperties2());
    }

    public VulkanSparseImageFormatProperties2(VkSparseImageFormatProperties2 vk){
        super(vk);
    }

    @Override
    public VkSparseImageFormatProperties2 getVk(){
        return (VkSparseImageFormatProperties2) super.getVk();
    }

    public VulkanSparseImageFormatProperties2(VulkanStructureType sType, VulkanObject pNext, VulkanSparseImageFormatProperties properties) {
        super(new VkSparseImageFormatProperties2(sType.getVk(), pNext.getVk(), properties.getVk()));
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

    public VulkanSparseImageFormatProperties getProperties() {
        return new VulkanSparseImageFormatProperties(getVk().getProperties());
    }

    public void setProperties(VulkanSparseImageFormatProperties properties) {
        getVk().setProperties(properties.getVk());
    }


    public static class Array extends VulkanSparseImageFormatProperties2 implements cz.mg.collections.array.ReadonlyArray<VulkanSparseImageFormatProperties2> {
        public Array(VkSparseImageFormatProperties2.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkSparseImageFormatProperties2.Array(count));
        }

        public Array(int count, VulkanSparseImageFormatProperties2 o){
            this(new VkSparseImageFormatProperties2.Array(count, o.getVk()));
        }

        @Override
        public VkSparseImageFormatProperties2.Array getVk(){
            return (VkSparseImageFormatProperties2.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSparseImageFormatProperties2 get(int i){
            return new VulkanSparseImageFormatProperties2(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkSparseImageFormatProperties2.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkSparseImageFormatProperties2.Pointer());
        }

        public Pointer(long value) {
            this(new VkSparseImageFormatProperties2.Pointer(value));
        }

        @Override
        public VkSparseImageFormatProperties2.Pointer getVk(){
            return (VkSparseImageFormatProperties2.Pointer) super.getVk();
        }

        public static class Array extends VulkanSparseImageFormatProperties2.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanSparseImageFormatProperties2.Pointer> {
            public Array(int count) {
                super(new VkSparseImageFormatProperties2.Pointer.Array(count));
            }

            public Array(VulkanSparseImageFormatProperties2[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkSparseImageFormatProperties2.Pointer.Array getVk(){
                return (VkSparseImageFormatProperties2.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanSparseImageFormatProperties2.Pointer get(int i){
                return new VulkanSparseImageFormatProperties2.Pointer(getVk().get(i));
            }
        }
    }
}
