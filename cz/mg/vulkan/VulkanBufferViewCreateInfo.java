package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkBufferViewCreateInfo.html">khronos documentation</a>
 **/
public class VulkanBufferViewCreateInfo extends VulkanObject {
    public VulkanBufferViewCreateInfo(){
        super(new VkBufferViewCreateInfo());
    }

    public VulkanBufferViewCreateInfo(VkBufferViewCreateInfo vk){
        super(vk);
    }

    @Override
    public VkBufferViewCreateInfo getVk(){
        return (VkBufferViewCreateInfo) super.getVk();
    }
    public VulkanBufferViewCreateInfo(VulkanObject pNext, VulkanBufferViewCreateFlags flags, VulkanBuffer buffer, VulkanFormat format, VulkanDeviceSize offset, VulkanDeviceSize range) {
        super(new VkBufferViewCreateInfo(pNext.getVk(), flags.getVk(), buffer.getVk(), format.getVk(), offset.getVk(), range.getVk()));
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

    public VulkanBufferViewCreateFlags getFlags() {
        return new VulkanBufferViewCreateFlags(getVk().getFlags());
    }

    public void setFlags(VulkanBufferViewCreateFlags flags) {
        getVk().setFlags(flags.getVk());
    }

    public VulkanBuffer getBuffer() {
        return new VulkanBuffer(getVk().getBuffer());
    }

    public void setBuffer(VulkanBuffer buffer) {
        getVk().setBuffer(buffer.getVk());
    }

    public VulkanFormat getFormat() {
        return new VulkanFormat(getVk().getFormat());
    }

    public void setFormat(VulkanFormat format) {
        getVk().setFormat(format.getVk());
    }

    public VulkanDeviceSize getOffset() {
        return new VulkanDeviceSize(getVk().getOffset());
    }

    public void setOffset(VulkanDeviceSize offset) {
        getVk().setOffset(offset.getVk());
    }

    public VulkanDeviceSize getRange() {
        return new VulkanDeviceSize(getVk().getRange());
    }

    public void setRange(VulkanDeviceSize range) {
        getVk().setRange(range.getVk());
    }


    public static class Array extends VulkanBufferViewCreateInfo implements cz.mg.collections.array.ReadonlyArray<VulkanBufferViewCreateInfo> {
        public Array(VkBufferViewCreateInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkBufferViewCreateInfo.Array(count));
        }

        public Array(int count, VulkanBufferViewCreateInfo o){
            this(new VkBufferViewCreateInfo.Array(count, o.getVk()));
        }

        @Override
        public VkBufferViewCreateInfo.Array getVk(){
            return (VkBufferViewCreateInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanBufferViewCreateInfo get(int i){
            return new VulkanBufferViewCreateInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkBufferViewCreateInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkBufferViewCreateInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkBufferViewCreateInfo.Pointer(value));
        }

        @Override
        public VkBufferViewCreateInfo.Pointer getVk(){
            return (VkBufferViewCreateInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanBufferViewCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanBufferViewCreateInfo.Pointer> {
            public Array(int count) {
                super(new VkBufferViewCreateInfo.Pointer.Array(count));
            }

            public Array(VulkanBufferViewCreateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkBufferViewCreateInfo.Pointer.Array getVk(){
                return (VkBufferViewCreateInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanBufferViewCreateInfo.Pointer get(int i){
                return new VulkanBufferViewCreateInfo.Pointer(getVk().get(i));
            }
        }
    }
}
