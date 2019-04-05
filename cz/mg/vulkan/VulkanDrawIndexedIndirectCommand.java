package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanDrawIndexedIndirectCommand extends VulkanObject {
    public VulkanDrawIndexedIndirectCommand(){
        super(new VkDrawIndexedIndirectCommand());
    }

    public VulkanDrawIndexedIndirectCommand(VkDrawIndexedIndirectCommand vk){
        super(vk);
    }

    @Override
    public VkDrawIndexedIndirectCommand getVk(){
        return (VkDrawIndexedIndirectCommand) super.getVk();
    }

    public VulkanDrawIndexedIndirectCommand(VulkanUInt32 indexCount, VulkanUInt32 instanceCount, VulkanUInt32 firstIndex, VulkanInt32 vertexOffset, VulkanUInt32 firstInstance) {
        super(new VkDrawIndexedIndirectCommand(indexCount.getVk(), instanceCount.getVk(), firstIndex.getVk(), vertexOffset.getVk(), firstInstance.getVk()));
    }

    public VulkanUInt32 getIndexCount() {
        return new VulkanUInt32(getVk().getIndexCount());
    }

    public void setIndexCount(VulkanUInt32 indexCount) {
        getVk().setIndexCount(indexCount.getVk());
    }

    public VulkanUInt32 getInstanceCount() {
        return new VulkanUInt32(getVk().getInstanceCount());
    }

    public void setInstanceCount(VulkanUInt32 instanceCount) {
        getVk().setInstanceCount(instanceCount.getVk());
    }

    public VulkanUInt32 getFirstIndex() {
        return new VulkanUInt32(getVk().getFirstIndex());
    }

    public void setFirstIndex(VulkanUInt32 firstIndex) {
        getVk().setFirstIndex(firstIndex.getVk());
    }

    public VulkanInt32 getVertexOffset() {
        return new VulkanInt32(getVk().getVertexOffset());
    }

    public void setVertexOffset(VulkanInt32 vertexOffset) {
        getVk().setVertexOffset(vertexOffset.getVk());
    }

    public VulkanUInt32 getFirstInstance() {
        return new VulkanUInt32(getVk().getFirstInstance());
    }

    public void setFirstInstance(VulkanUInt32 firstInstance) {
        getVk().setFirstInstance(firstInstance.getVk());
    }


    public static class Array extends VulkanDrawIndexedIndirectCommand implements cz.mg.collections.array.ReadonlyArray<VulkanDrawIndexedIndirectCommand> {
        public Array(VkDrawIndexedIndirectCommand.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDrawIndexedIndirectCommand.Array(count));
        }

        public Array(int count, VulkanDrawIndexedIndirectCommand o){
            this(new VkDrawIndexedIndirectCommand.Array(count, o.getVk()));
        }

        @Override
        public VkDrawIndexedIndirectCommand.Array getVk(){
            return (VkDrawIndexedIndirectCommand.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDrawIndexedIndirectCommand get(int i){
            return new VulkanDrawIndexedIndirectCommand(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDrawIndexedIndirectCommand.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDrawIndexedIndirectCommand.Pointer());
        }

        public Pointer(long value) {
            this(new VkDrawIndexedIndirectCommand.Pointer(value));
        }

        @Override
        public VkDrawIndexedIndirectCommand.Pointer getVk(){
            return (VkDrawIndexedIndirectCommand.Pointer) super.getVk();
        }

        public static class Array extends VulkanDrawIndexedIndirectCommand.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDrawIndexedIndirectCommand.Pointer> {
            public Array(int count) {
                super(new VkDrawIndexedIndirectCommand.Pointer.Array(count));
            }

            public Array(VulkanDrawIndexedIndirectCommand[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDrawIndexedIndirectCommand.Pointer.Array getVk(){
                return (VkDrawIndexedIndirectCommand.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDrawIndexedIndirectCommand.Pointer get(int i){
                return new VulkanDrawIndexedIndirectCommand.Pointer(getVk().get(i));
            }
        }
    }
}
