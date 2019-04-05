package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanBindImageMemoryInfo extends VulkanObject {
    public VulkanBindImageMemoryInfo(){
        super(new VkBindImageMemoryInfo());
    }

    public VulkanBindImageMemoryInfo(VkBindImageMemoryInfo vk){
        super(vk);
    }

    @Override
    public VkBindImageMemoryInfo getVk(){
        return (VkBindImageMemoryInfo) super.getVk();
    }
    public VulkanBindImageMemoryInfo(VulkanObject pNext, VulkanImage image, VulkanDeviceMemory memory, VulkanDeviceSize memoryOffset) {
        super(new VkBindImageMemoryInfo(pNext.getVk(), image.getVk(), memory.getVk(), memoryOffset.getVk()));
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

    public VulkanImage getImage() {
        return new VulkanImage(getVk().getImage());
    }

    public void setImage(VulkanImage image) {
        getVk().setImage(image.getVk());
    }

    public VulkanDeviceMemory getMemory() {
        return new VulkanDeviceMemory(getVk().getMemory());
    }

    public void setMemory(VulkanDeviceMemory memory) {
        getVk().setMemory(memory.getVk());
    }

    public VulkanDeviceSize getMemoryOffset() {
        return new VulkanDeviceSize(getVk().getMemoryOffset());
    }

    public void setMemoryOffset(VulkanDeviceSize memoryOffset) {
        getVk().setMemoryOffset(memoryOffset.getVk());
    }


    public static class Array extends VulkanBindImageMemoryInfo implements cz.mg.collections.array.ReadonlyArray<VulkanBindImageMemoryInfo> {
        public Array(VkBindImageMemoryInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkBindImageMemoryInfo.Array(count));
        }

        public Array(int count, VulkanBindImageMemoryInfo o){
            this(new VkBindImageMemoryInfo.Array(count, o.getVk()));
        }

        @Override
        public VkBindImageMemoryInfo.Array getVk(){
            return (VkBindImageMemoryInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanBindImageMemoryInfo get(int i){
            return new VulkanBindImageMemoryInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkBindImageMemoryInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkBindImageMemoryInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkBindImageMemoryInfo.Pointer(value));
        }

        @Override
        public VkBindImageMemoryInfo.Pointer getVk(){
            return (VkBindImageMemoryInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanBindImageMemoryInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanBindImageMemoryInfo.Pointer> {
            public Array(int count) {
                super(new VkBindImageMemoryInfo.Pointer.Array(count));
            }

            public Array(VulkanBindImageMemoryInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkBindImageMemoryInfo.Pointer.Array getVk(){
                return (VkBindImageMemoryInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanBindImageMemoryInfo.Pointer get(int i){
                return new VulkanBindImageMemoryInfo.Pointer(getVk().get(i));
            }
        }
    }
}
