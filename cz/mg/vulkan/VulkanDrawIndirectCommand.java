package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanDrawIndirectCommand extends VulkanObject {
    public VulkanDrawIndirectCommand(){
        super(new VkDrawIndirectCommand());
    }

    public VulkanDrawIndirectCommand(VkDrawIndirectCommand vk){
        super(vk);
    }

    @Override
    public VkDrawIndirectCommand getVk(){
        return (VkDrawIndirectCommand) super.getVk();
    }

    public VulkanDrawIndirectCommand(VulkanUInt32 vertexCount, VulkanUInt32 instanceCount, VulkanUInt32 firstVertex, VulkanUInt32 firstInstance) {
        super(new VkDrawIndirectCommand(vertexCount.getVk(), instanceCount.getVk(), firstVertex.getVk(), firstInstance.getVk()));
    }

    public VulkanUInt32 getVertexCount() {
        return new VulkanUInt32(getVk().getVertexCount());
    }

    public void setVertexCount(VulkanUInt32 vertexCount) {
        getVk().setVertexCount(vertexCount.getVk());
    }

    public VulkanUInt32 getInstanceCount() {
        return new VulkanUInt32(getVk().getInstanceCount());
    }

    public void setInstanceCount(VulkanUInt32 instanceCount) {
        getVk().setInstanceCount(instanceCount.getVk());
    }

    public VulkanUInt32 getFirstVertex() {
        return new VulkanUInt32(getVk().getFirstVertex());
    }

    public void setFirstVertex(VulkanUInt32 firstVertex) {
        getVk().setFirstVertex(firstVertex.getVk());
    }

    public VulkanUInt32 getFirstInstance() {
        return new VulkanUInt32(getVk().getFirstInstance());
    }

    public void setFirstInstance(VulkanUInt32 firstInstance) {
        getVk().setFirstInstance(firstInstance.getVk());
    }


    public static class Array extends VulkanDrawIndirectCommand implements cz.mg.collections.array.ReadonlyArray<VulkanDrawIndirectCommand> {
        public Array(VkDrawIndirectCommand.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDrawIndirectCommand.Array(count));
        }

        public Array(int count, VulkanDrawIndirectCommand o){
            this(new VkDrawIndirectCommand.Array(count, o.getVk()));
        }

        @Override
        public VkDrawIndirectCommand.Array getVk(){
            return (VkDrawIndirectCommand.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDrawIndirectCommand get(int i){
            return new VulkanDrawIndirectCommand(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDrawIndirectCommand.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDrawIndirectCommand.Pointer());
        }

        public Pointer(long value) {
            this(new VkDrawIndirectCommand.Pointer(value));
        }

        @Override
        public VkDrawIndirectCommand.Pointer getVk(){
            return (VkDrawIndirectCommand.Pointer) super.getVk();
        }

        public static class Array extends VulkanDrawIndirectCommand.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDrawIndirectCommand.Pointer> {
            public Array(int count) {
                super(new VkDrawIndirectCommand.Pointer.Array(count));
            }

            public Array(VulkanDrawIndirectCommand[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDrawIndirectCommand.Pointer.Array getVk(){
                return (VkDrawIndirectCommand.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDrawIndirectCommand.Pointer get(int i){
                return new VulkanDrawIndirectCommand.Pointer(getVk().get(i));
            }
        }
    }
}
