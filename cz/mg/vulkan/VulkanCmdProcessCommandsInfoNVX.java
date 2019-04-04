package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkCmdProcessCommandsInfoNVX.html">khronos documentation</a>
 **/
public class VulkanCmdProcessCommandsInfoNVX extends VulkanObject {
    public VulkanCmdProcessCommandsInfoNVX(){
        super(new VkCmdProcessCommandsInfoNVX());
    }

    public VulkanCmdProcessCommandsInfoNVX(VkCmdProcessCommandsInfoNVX vk){
        super(vk);
    }

    @Override
    public VkCmdProcessCommandsInfoNVX getVk(){
        return (VkCmdProcessCommandsInfoNVX) super.getVk();
    }
    public VulkanCmdProcessCommandsInfoNVX(VulkanObject pNext, VulkanObjectTableNVX objectTable, VulkanIndirectCommandsLayoutNVX indirectCommandsLayout, VulkanUInt32 indirectCommandsTokenCount, VulkanIndirectCommandsTokenNVX pIndirectCommandsTokens, VulkanUInt32 maxSequencesCount, VulkanCommandBuffer targetCommandBuffer, VulkanBuffer sequencesCountBuffer, VulkanDeviceSize sequencesCountOffset, VulkanBuffer sequencesIndexBuffer, VulkanDeviceSize sequencesIndexOffset) {
        super(new VkCmdProcessCommandsInfoNVX(pNext.getVk(), objectTable.getVk(), indirectCommandsLayout.getVk(), indirectCommandsTokenCount.getVk(), pIndirectCommandsTokens.getVk(), maxSequencesCount.getVk(), targetCommandBuffer.getVk(), sequencesCountBuffer.getVk(), sequencesCountOffset.getVk(), sequencesIndexBuffer.getVk(), sequencesIndexOffset.getVk()));
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

    public VulkanObjectTableNVX getObjectTable() {
        return new VulkanObjectTableNVX(getVk().getObjectTable());
    }

    public void setObjectTable(VulkanObjectTableNVX objectTable) {
        getVk().setObjectTable(objectTable.getVk());
    }

    public VulkanIndirectCommandsLayoutNVX getIndirectCommandsLayout() {
        return new VulkanIndirectCommandsLayoutNVX(getVk().getIndirectCommandsLayout());
    }

    public void setIndirectCommandsLayout(VulkanIndirectCommandsLayoutNVX indirectCommandsLayout) {
        getVk().setIndirectCommandsLayout(indirectCommandsLayout.getVk());
    }

    public VulkanUInt32 getIndirectCommandsTokenCount() {
        return new VulkanUInt32(getVk().getIndirectCommandsTokenCount());
    }

    public void setIndirectCommandsTokenCount(VulkanUInt32 indirectCommandsTokenCount) {
        getVk().setIndirectCommandsTokenCount(indirectCommandsTokenCount.getVk());
    }

    public VulkanIndirectCommandsTokenNVX getPIndirectCommandsTokens() {
        return new VulkanIndirectCommandsTokenNVX(getVk().getPIndirectCommandsTokens());
    }

    public void setPIndirectCommandsTokens(VulkanIndirectCommandsTokenNVX pIndirectCommandsTokens) {
        getVk().setPIndirectCommandsTokens(pIndirectCommandsTokens.getVk());
    }

    public VulkanUInt32 getMaxSequencesCount() {
        return new VulkanUInt32(getVk().getMaxSequencesCount());
    }

    public void setMaxSequencesCount(VulkanUInt32 maxSequencesCount) {
        getVk().setMaxSequencesCount(maxSequencesCount.getVk());
    }

    public VulkanCommandBuffer getTargetCommandBuffer() {
        return new VulkanCommandBuffer(getVk().getTargetCommandBuffer());
    }

    public void setTargetCommandBuffer(VulkanCommandBuffer targetCommandBuffer) {
        getVk().setTargetCommandBuffer(targetCommandBuffer.getVk());
    }

    public VulkanBuffer getSequencesCountBuffer() {
        return new VulkanBuffer(getVk().getSequencesCountBuffer());
    }

    public void setSequencesCountBuffer(VulkanBuffer sequencesCountBuffer) {
        getVk().setSequencesCountBuffer(sequencesCountBuffer.getVk());
    }

    public VulkanDeviceSize getSequencesCountOffset() {
        return new VulkanDeviceSize(getVk().getSequencesCountOffset());
    }

    public void setSequencesCountOffset(VulkanDeviceSize sequencesCountOffset) {
        getVk().setSequencesCountOffset(sequencesCountOffset.getVk());
    }

    public VulkanBuffer getSequencesIndexBuffer() {
        return new VulkanBuffer(getVk().getSequencesIndexBuffer());
    }

    public void setSequencesIndexBuffer(VulkanBuffer sequencesIndexBuffer) {
        getVk().setSequencesIndexBuffer(sequencesIndexBuffer.getVk());
    }

    public VulkanDeviceSize getSequencesIndexOffset() {
        return new VulkanDeviceSize(getVk().getSequencesIndexOffset());
    }

    public void setSequencesIndexOffset(VulkanDeviceSize sequencesIndexOffset) {
        getVk().setSequencesIndexOffset(sequencesIndexOffset.getVk());
    }


    public static class Array extends VulkanCmdProcessCommandsInfoNVX implements cz.mg.collections.array.ReadonlyArray<VulkanCmdProcessCommandsInfoNVX> {
        public Array(VkCmdProcessCommandsInfoNVX.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkCmdProcessCommandsInfoNVX.Array(count));
        }

        public Array(int count, VulkanCmdProcessCommandsInfoNVX o){
            this(new VkCmdProcessCommandsInfoNVX.Array(count, o.getVk()));
        }

        @Override
        public VkCmdProcessCommandsInfoNVX.Array getVk(){
            return (VkCmdProcessCommandsInfoNVX.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanCmdProcessCommandsInfoNVX get(int i){
            return new VulkanCmdProcessCommandsInfoNVX(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkCmdProcessCommandsInfoNVX.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkCmdProcessCommandsInfoNVX.Pointer());
        }

        public Pointer(long value) {
            this(new VkCmdProcessCommandsInfoNVX.Pointer(value));
        }

        @Override
        public VkCmdProcessCommandsInfoNVX.Pointer getVk(){
            return (VkCmdProcessCommandsInfoNVX.Pointer) super.getVk();
        }

        public static class Array extends VulkanCmdProcessCommandsInfoNVX.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanCmdProcessCommandsInfoNVX.Pointer> {
            public Array(int count) {
                super(new VkCmdProcessCommandsInfoNVX.Pointer.Array(count));
            }

            public Array(VulkanCmdProcessCommandsInfoNVX[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkCmdProcessCommandsInfoNVX.Pointer.Array getVk(){
                return (VkCmdProcessCommandsInfoNVX.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanCmdProcessCommandsInfoNVX.Pointer get(int i){
                return new VulkanCmdProcessCommandsInfoNVX.Pointer(getVk().get(i));
            }
        }
    }
}
