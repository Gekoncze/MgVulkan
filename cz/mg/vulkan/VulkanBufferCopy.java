package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkBufferCopy.html">khronos documentation</a>
 **/
public class VulkanBufferCopy extends VulkanObject {
    public VulkanBufferCopy(){
        super(new VkBufferCopy());
    }

    public VulkanBufferCopy(VkBufferCopy vk){
        super(vk);
    }

    @Override
    public VkBufferCopy getVk(){
        return (VkBufferCopy) super.getVk();
    }

    public VulkanBufferCopy(VulkanDeviceSize srcOffset, VulkanDeviceSize dstOffset, VulkanDeviceSize size) {
        super(new VkBufferCopy(srcOffset.getVk(), dstOffset.getVk(), size.getVk()));
    }

    public VulkanDeviceSize getSrcOffset() {
        return new VulkanDeviceSize(getVk().getSrcOffset());
    }

    public void setSrcOffset(VulkanDeviceSize srcOffset) {
        getVk().setSrcOffset(srcOffset.getVk());
    }

    public VulkanDeviceSize getDstOffset() {
        return new VulkanDeviceSize(getVk().getDstOffset());
    }

    public void setDstOffset(VulkanDeviceSize dstOffset) {
        getVk().setDstOffset(dstOffset.getVk());
    }

    public VulkanDeviceSize getSize() {
        return new VulkanDeviceSize(getVk().getSize());
    }

    public void setSize(VulkanDeviceSize size) {
        getVk().setSize(size.getVk());
    }


    public static class Array extends VulkanBufferCopy implements cz.mg.collections.array.ReadonlyArray<VulkanBufferCopy> {
        public Array(VkBufferCopy.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkBufferCopy.Array(count));
        }

        public Array(int count, VulkanBufferCopy o){
            this(new VkBufferCopy.Array(count, o.getVk()));
        }

        @Override
        public VkBufferCopy.Array getVk(){
            return (VkBufferCopy.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanBufferCopy get(int i){
            return new VulkanBufferCopy(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkBufferCopy.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkBufferCopy.Pointer());
        }

        public Pointer(long value) {
            this(new VkBufferCopy.Pointer(value));
        }

        @Override
        public VkBufferCopy.Pointer getVk(){
            return (VkBufferCopy.Pointer) super.getVk();
        }

        public static class Array extends VulkanBufferCopy.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanBufferCopy.Pointer> {
            public Array(int count) {
                super(new VkBufferCopy.Pointer.Array(count));
            }

            public Array(VulkanBufferCopy[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkBufferCopy.Pointer.Array getVk(){
                return (VkBufferCopy.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanBufferCopy.Pointer get(int i){
                return new VulkanBufferCopy.Pointer(getVk().get(i));
            }
        }
    }
}
