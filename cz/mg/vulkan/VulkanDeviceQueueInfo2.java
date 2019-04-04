package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDeviceQueueInfo2.html">khronos documentation</a>
 **/
public class VulkanDeviceQueueInfo2 extends VulkanObject {
    public VulkanDeviceQueueInfo2(){
        super(new VkDeviceQueueInfo2());
    }

    public VulkanDeviceQueueInfo2(VkDeviceQueueInfo2 vk){
        super(vk);
    }

    @Override
    public VkDeviceQueueInfo2 getVk(){
        return (VkDeviceQueueInfo2) super.getVk();
    }
    public VulkanDeviceQueueInfo2(VulkanObject pNext, VulkanDeviceQueueCreateFlags flags, VulkanUInt32 queueFamilyIndex, VulkanUInt32 queueIndex) {
        super(new VkDeviceQueueInfo2(pNext.getVk(), flags.getVk(), queueFamilyIndex.getVk(), queueIndex.getVk()));
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

    public VulkanDeviceQueueCreateFlags getFlags() {
        return new VulkanDeviceQueueCreateFlags(getVk().getFlags());
    }

    public void setFlags(VulkanDeviceQueueCreateFlags flags) {
        getVk().setFlags(flags.getVk());
    }

    public VulkanUInt32 getQueueFamilyIndex() {
        return new VulkanUInt32(getVk().getQueueFamilyIndex());
    }

    public void setQueueFamilyIndex(VulkanUInt32 queueFamilyIndex) {
        getVk().setQueueFamilyIndex(queueFamilyIndex.getVk());
    }

    public VulkanUInt32 getQueueIndex() {
        return new VulkanUInt32(getVk().getQueueIndex());
    }

    public void setQueueIndex(VulkanUInt32 queueIndex) {
        getVk().setQueueIndex(queueIndex.getVk());
    }


    public static class Array extends VulkanDeviceQueueInfo2 implements cz.mg.collections.array.ReadonlyArray<VulkanDeviceQueueInfo2> {
        public Array(VkDeviceQueueInfo2.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDeviceQueueInfo2.Array(count));
        }

        public Array(int count, VulkanDeviceQueueInfo2 o){
            this(new VkDeviceQueueInfo2.Array(count, o.getVk()));
        }

        @Override
        public VkDeviceQueueInfo2.Array getVk(){
            return (VkDeviceQueueInfo2.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDeviceQueueInfo2 get(int i){
            return new VulkanDeviceQueueInfo2(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDeviceQueueInfo2.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDeviceQueueInfo2.Pointer());
        }

        public Pointer(long value) {
            this(new VkDeviceQueueInfo2.Pointer(value));
        }

        @Override
        public VkDeviceQueueInfo2.Pointer getVk(){
            return (VkDeviceQueueInfo2.Pointer) super.getVk();
        }

        public static class Array extends VulkanDeviceQueueInfo2.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDeviceQueueInfo2.Pointer> {
            public Array(int count) {
                super(new VkDeviceQueueInfo2.Pointer.Array(count));
            }

            public Array(VulkanDeviceQueueInfo2[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDeviceQueueInfo2.Pointer.Array getVk(){
                return (VkDeviceQueueInfo2.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDeviceQueueInfo2.Pointer get(int i){
                return new VulkanDeviceQueueInfo2.Pointer(getVk().get(i));
            }
        }
    }
}
