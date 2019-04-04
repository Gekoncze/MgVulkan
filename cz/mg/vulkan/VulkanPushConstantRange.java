package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPushConstantRange.html">khronos documentation</a>
 **/
public class VulkanPushConstantRange extends VulkanObject {
    public VulkanPushConstantRange(){
        super(new VkPushConstantRange());
    }

    public VulkanPushConstantRange(VkPushConstantRange vk){
        super(vk);
    }

    @Override
    public VkPushConstantRange getVk(){
        return (VkPushConstantRange) super.getVk();
    }

    public VulkanPushConstantRange(VulkanShaderStageFlags stageFlags, VulkanUInt32 offset, VulkanUInt32 size) {
        super(new VkPushConstantRange(stageFlags.getVk(), offset.getVk(), size.getVk()));
    }

    public VulkanShaderStageFlags getStageFlags() {
        return new VulkanShaderStageFlags(getVk().getStageFlags());
    }

    public void setStageFlags(VulkanShaderStageFlags stageFlags) {
        getVk().setStageFlags(stageFlags.getVk());
    }

    public VulkanUInt32 getOffset() {
        return new VulkanUInt32(getVk().getOffset());
    }

    public void setOffset(VulkanUInt32 offset) {
        getVk().setOffset(offset.getVk());
    }

    public VulkanUInt32 getSize() {
        return new VulkanUInt32(getVk().getSize());
    }

    public void setSize(VulkanUInt32 size) {
        getVk().setSize(size.getVk());
    }


    public static class Array extends VulkanPushConstantRange implements cz.mg.collections.array.ReadonlyArray<VulkanPushConstantRange> {
        public Array(VkPushConstantRange.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPushConstantRange.Array(count));
        }

        public Array(int count, VulkanPushConstantRange o){
            this(new VkPushConstantRange.Array(count, o.getVk()));
        }

        @Override
        public VkPushConstantRange.Array getVk(){
            return (VkPushConstantRange.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPushConstantRange get(int i){
            return new VulkanPushConstantRange(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPushConstantRange.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPushConstantRange.Pointer());
        }

        public Pointer(long value) {
            this(new VkPushConstantRange.Pointer(value));
        }

        @Override
        public VkPushConstantRange.Pointer getVk(){
            return (VkPushConstantRange.Pointer) super.getVk();
        }

        public static class Array extends VulkanPushConstantRange.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPushConstantRange.Pointer> {
            public Array(int count) {
                super(new VkPushConstantRange.Pointer.Array(count));
            }

            public Array(VulkanPushConstantRange[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPushConstantRange.Pointer.Array getVk(){
                return (VkPushConstantRange.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPushConstantRange.Pointer get(int i){
                return new VulkanPushConstantRange.Pointer(getVk().get(i));
            }
        }
    }
}
