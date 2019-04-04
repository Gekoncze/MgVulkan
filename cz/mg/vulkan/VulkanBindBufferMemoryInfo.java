package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkBindBufferMemoryInfo.html">khronos documentation</a>
 **/
public class VulkanBindBufferMemoryInfo extends VulkanObject {
    public VulkanBindBufferMemoryInfo(){
        super(new VkBindBufferMemoryInfo());
    }

    public VulkanBindBufferMemoryInfo(VkBindBufferMemoryInfo vk){
        super(vk);
    }

    @Override
    public VkBindBufferMemoryInfo getVk(){
        return (VkBindBufferMemoryInfo) super.getVk();
    }
    public VulkanBindBufferMemoryInfo(VulkanObject pNext, VulkanBuffer buffer, VulkanDeviceMemory memory, VulkanDeviceSize memoryOffset) {
        super(new VkBindBufferMemoryInfo(pNext.getVk(), buffer.getVk(), memory.getVk(), memoryOffset.getVk()));
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

    public VulkanBuffer getBuffer() {
        return new VulkanBuffer(getVk().getBuffer());
    }

    public void setBuffer(VulkanBuffer buffer) {
        getVk().setBuffer(buffer.getVk());
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


    public static class Array extends VulkanBindBufferMemoryInfo implements cz.mg.collections.array.ReadonlyArray<VulkanBindBufferMemoryInfo> {
        public Array(VkBindBufferMemoryInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkBindBufferMemoryInfo.Array(count));
        }

        public Array(int count, VulkanBindBufferMemoryInfo o){
            this(new VkBindBufferMemoryInfo.Array(count, o.getVk()));
        }

        @Override
        public VkBindBufferMemoryInfo.Array getVk(){
            return (VkBindBufferMemoryInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanBindBufferMemoryInfo get(int i){
            return new VulkanBindBufferMemoryInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkBindBufferMemoryInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkBindBufferMemoryInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkBindBufferMemoryInfo.Pointer(value));
        }

        @Override
        public VkBindBufferMemoryInfo.Pointer getVk(){
            return (VkBindBufferMemoryInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanBindBufferMemoryInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanBindBufferMemoryInfo.Pointer> {
            public Array(int count) {
                super(new VkBindBufferMemoryInfo.Pointer.Array(count));
            }

            public Array(VulkanBindBufferMemoryInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkBindBufferMemoryInfo.Pointer.Array getVk(){
                return (VkBindBufferMemoryInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanBindBufferMemoryInfo.Pointer get(int i){
                return new VulkanBindBufferMemoryInfo.Pointer(getVk().get(i));
            }
        }
    }
}
