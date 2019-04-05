package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanCmdReserveSpaceForCommandsInfoNVX extends VulkanObject {
    public VulkanCmdReserveSpaceForCommandsInfoNVX(){
        super(new VkCmdReserveSpaceForCommandsInfoNVX());
    }

    public VulkanCmdReserveSpaceForCommandsInfoNVX(VkCmdReserveSpaceForCommandsInfoNVX vk){
        super(vk);
    }

    @Override
    public VkCmdReserveSpaceForCommandsInfoNVX getVk(){
        return (VkCmdReserveSpaceForCommandsInfoNVX) super.getVk();
    }
    public VulkanCmdReserveSpaceForCommandsInfoNVX(VulkanObject pNext, VulkanObjectTableNVX objectTable, VulkanIndirectCommandsLayoutNVX indirectCommandsLayout, VulkanUInt32 maxSequencesCount) {
        super(new VkCmdReserveSpaceForCommandsInfoNVX(pNext.getVk(), objectTable.getVk(), indirectCommandsLayout.getVk(), maxSequencesCount.getVk()));
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

    public VulkanUInt32 getMaxSequencesCount() {
        return new VulkanUInt32(getVk().getMaxSequencesCount());
    }

    public void setMaxSequencesCount(VulkanUInt32 maxSequencesCount) {
        getVk().setMaxSequencesCount(maxSequencesCount.getVk());
    }


    public static class Array extends VulkanCmdReserveSpaceForCommandsInfoNVX implements cz.mg.collections.array.ReadonlyArray<VulkanCmdReserveSpaceForCommandsInfoNVX> {
        public Array(VkCmdReserveSpaceForCommandsInfoNVX.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkCmdReserveSpaceForCommandsInfoNVX.Array(count));
        }

        public Array(int count, VulkanCmdReserveSpaceForCommandsInfoNVX o){
            this(new VkCmdReserveSpaceForCommandsInfoNVX.Array(count, o.getVk()));
        }

        @Override
        public VkCmdReserveSpaceForCommandsInfoNVX.Array getVk(){
            return (VkCmdReserveSpaceForCommandsInfoNVX.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanCmdReserveSpaceForCommandsInfoNVX get(int i){
            return new VulkanCmdReserveSpaceForCommandsInfoNVX(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkCmdReserveSpaceForCommandsInfoNVX.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkCmdReserveSpaceForCommandsInfoNVX.Pointer());
        }

        public Pointer(long value) {
            this(new VkCmdReserveSpaceForCommandsInfoNVX.Pointer(value));
        }

        @Override
        public VkCmdReserveSpaceForCommandsInfoNVX.Pointer getVk(){
            return (VkCmdReserveSpaceForCommandsInfoNVX.Pointer) super.getVk();
        }

        public static class Array extends VulkanCmdReserveSpaceForCommandsInfoNVX.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanCmdReserveSpaceForCommandsInfoNVX.Pointer> {
            public Array(int count) {
                super(new VkCmdReserveSpaceForCommandsInfoNVX.Pointer.Array(count));
            }

            public Array(VulkanCmdReserveSpaceForCommandsInfoNVX[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkCmdReserveSpaceForCommandsInfoNVX.Pointer.Array getVk(){
                return (VkCmdReserveSpaceForCommandsInfoNVX.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanCmdReserveSpaceForCommandsInfoNVX.Pointer get(int i){
                return new VulkanCmdReserveSpaceForCommandsInfoNVX.Pointer(getVk().get(i));
            }
        }
    }
}
