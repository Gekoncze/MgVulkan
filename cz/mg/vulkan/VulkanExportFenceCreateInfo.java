package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanExportFenceCreateInfo extends VulkanObject {
    public VulkanExportFenceCreateInfo(){
        super(new VkExportFenceCreateInfo());
    }

    public VulkanExportFenceCreateInfo(VkExportFenceCreateInfo vk){
        super(vk);
    }

    @Override
    public VkExportFenceCreateInfo getVk(){
        return (VkExportFenceCreateInfo) super.getVk();
    }
    public VulkanExportFenceCreateInfo(VulkanObject pNext, VulkanExternalFenceHandleTypeFlags handleTypes) {
        super(new VkExportFenceCreateInfo(pNext.getVk(), handleTypes.getVk()));
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

    public VulkanExternalFenceHandleTypeFlags getHandleTypes() {
        return new VulkanExternalFenceHandleTypeFlags(getVk().getHandleTypes());
    }

    public void setHandleTypes(VulkanExternalFenceHandleTypeFlags handleTypes) {
        getVk().setHandleTypes(handleTypes.getVk());
    }


    public static class Array extends VulkanExportFenceCreateInfo implements cz.mg.collections.array.ReadonlyArray<VulkanExportFenceCreateInfo> {
        public Array(VkExportFenceCreateInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkExportFenceCreateInfo.Array(count));
        }

        public Array(int count, VulkanExportFenceCreateInfo o){
            this(new VkExportFenceCreateInfo.Array(count, o.getVk()));
        }

        @Override
        public VkExportFenceCreateInfo.Array getVk(){
            return (VkExportFenceCreateInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanExportFenceCreateInfo get(int i){
            return new VulkanExportFenceCreateInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkExportFenceCreateInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkExportFenceCreateInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkExportFenceCreateInfo.Pointer(value));
        }

        @Override
        public VkExportFenceCreateInfo.Pointer getVk(){
            return (VkExportFenceCreateInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanExportFenceCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanExportFenceCreateInfo.Pointer> {
            public Array(int count) {
                super(new VkExportFenceCreateInfo.Pointer.Array(count));
            }

            public Array(VulkanExportFenceCreateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkExportFenceCreateInfo.Pointer.Array getVk(){
                return (VkExportFenceCreateInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanExportFenceCreateInfo.Pointer get(int i){
                return new VulkanExportFenceCreateInfo.Pointer(getVk().get(i));
            }
        }
    }
}
