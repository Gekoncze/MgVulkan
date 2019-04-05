package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanSubresourceLayout extends VulkanObject {
    public VulkanSubresourceLayout(){
        super(new VkSubresourceLayout());
    }

    public VulkanSubresourceLayout(VkSubresourceLayout vk){
        super(vk);
    }

    @Override
    public VkSubresourceLayout getVk(){
        return (VkSubresourceLayout) super.getVk();
    }

    public VulkanSubresourceLayout(VulkanDeviceSize offset, VulkanDeviceSize size, VulkanDeviceSize rowPitch, VulkanDeviceSize arrayPitch, VulkanDeviceSize depthPitch) {
        super(new VkSubresourceLayout(offset.getVk(), size.getVk(), rowPitch.getVk(), arrayPitch.getVk(), depthPitch.getVk()));
    }

    public VulkanDeviceSize getOffset() {
        return new VulkanDeviceSize(getVk().getOffset());
    }

    public void setOffset(VulkanDeviceSize offset) {
        getVk().setOffset(offset.getVk());
    }

    public VulkanDeviceSize getSize() {
        return new VulkanDeviceSize(getVk().getSize());
    }

    public void setSize(VulkanDeviceSize size) {
        getVk().setSize(size.getVk());
    }

    public VulkanDeviceSize getRowPitch() {
        return new VulkanDeviceSize(getVk().getRowPitch());
    }

    public void setRowPitch(VulkanDeviceSize rowPitch) {
        getVk().setRowPitch(rowPitch.getVk());
    }

    public VulkanDeviceSize getArrayPitch() {
        return new VulkanDeviceSize(getVk().getArrayPitch());
    }

    public void setArrayPitch(VulkanDeviceSize arrayPitch) {
        getVk().setArrayPitch(arrayPitch.getVk());
    }

    public VulkanDeviceSize getDepthPitch() {
        return new VulkanDeviceSize(getVk().getDepthPitch());
    }

    public void setDepthPitch(VulkanDeviceSize depthPitch) {
        getVk().setDepthPitch(depthPitch.getVk());
    }


    public static class Array extends VulkanSubresourceLayout implements cz.mg.collections.array.ReadonlyArray<VulkanSubresourceLayout> {
        public Array(VkSubresourceLayout.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkSubresourceLayout.Array(count));
        }

        public Array(int count, VulkanSubresourceLayout o){
            this(new VkSubresourceLayout.Array(count, o.getVk()));
        }

        @Override
        public VkSubresourceLayout.Array getVk(){
            return (VkSubresourceLayout.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSubresourceLayout get(int i){
            return new VulkanSubresourceLayout(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkSubresourceLayout.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkSubresourceLayout.Pointer());
        }

        public Pointer(long value) {
            this(new VkSubresourceLayout.Pointer(value));
        }

        @Override
        public VkSubresourceLayout.Pointer getVk(){
            return (VkSubresourceLayout.Pointer) super.getVk();
        }

        public static class Array extends VulkanSubresourceLayout.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanSubresourceLayout.Pointer> {
            public Array(int count) {
                super(new VkSubresourceLayout.Pointer.Array(count));
            }

            public Array(VulkanSubresourceLayout[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkSubresourceLayout.Pointer.Array getVk(){
                return (VkSubresourceLayout.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanSubresourceLayout.Pointer get(int i){
                return new VulkanSubresourceLayout.Pointer(getVk().get(i));
            }
        }
    }
}
