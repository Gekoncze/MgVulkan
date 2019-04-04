package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkQueueFamilyProperties2.html">khronos documentation</a>
 **/
public class VulkanQueueFamilyProperties2 extends VulkanObject {
    public VulkanQueueFamilyProperties2(){
        super(new VkQueueFamilyProperties2());
    }

    public VulkanQueueFamilyProperties2(VkQueueFamilyProperties2 vk){
        super(vk);
    }

    @Override
    public VkQueueFamilyProperties2 getVk(){
        return (VkQueueFamilyProperties2) super.getVk();
    }

    public VulkanQueueFamilyProperties2(VulkanStructureType sType, VulkanObject pNext, VulkanQueueFamilyProperties queueFamilyProperties) {
        super(new VkQueueFamilyProperties2(sType.getVk(), pNext.getVk(), queueFamilyProperties.getVk()));
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

    public VulkanQueueFamilyProperties getQueueFamilyProperties() {
        return new VulkanQueueFamilyProperties(getVk().getQueueFamilyProperties());
    }

    public void setQueueFamilyProperties(VulkanQueueFamilyProperties queueFamilyProperties) {
        getVk().setQueueFamilyProperties(queueFamilyProperties.getVk());
    }


    public static class Array extends VulkanQueueFamilyProperties2 implements cz.mg.collections.array.ReadonlyArray<VulkanQueueFamilyProperties2> {
        public Array(VkQueueFamilyProperties2.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkQueueFamilyProperties2.Array(count));
        }

        public Array(int count, VulkanQueueFamilyProperties2 o){
            this(new VkQueueFamilyProperties2.Array(count, o.getVk()));
        }

        @Override
        public VkQueueFamilyProperties2.Array getVk(){
            return (VkQueueFamilyProperties2.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanQueueFamilyProperties2 get(int i){
            return new VulkanQueueFamilyProperties2(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkQueueFamilyProperties2.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkQueueFamilyProperties2.Pointer());
        }

        public Pointer(long value) {
            this(new VkQueueFamilyProperties2.Pointer(value));
        }

        @Override
        public VkQueueFamilyProperties2.Pointer getVk(){
            return (VkQueueFamilyProperties2.Pointer) super.getVk();
        }

        public static class Array extends VulkanQueueFamilyProperties2.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanQueueFamilyProperties2.Pointer> {
            public Array(int count) {
                super(new VkQueueFamilyProperties2.Pointer.Array(count));
            }

            public Array(VulkanQueueFamilyProperties2[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkQueueFamilyProperties2.Pointer.Array getVk(){
                return (VkQueueFamilyProperties2.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanQueueFamilyProperties2.Pointer get(int i){
                return new VulkanQueueFamilyProperties2.Pointer(getVk().get(i));
            }
        }
    }
}
