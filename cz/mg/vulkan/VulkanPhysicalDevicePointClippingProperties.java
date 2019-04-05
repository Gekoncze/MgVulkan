package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanPhysicalDevicePointClippingProperties extends VulkanObject {
    public VulkanPhysicalDevicePointClippingProperties(){
        super(new VkPhysicalDevicePointClippingProperties());
    }

    public VulkanPhysicalDevicePointClippingProperties(VkPhysicalDevicePointClippingProperties vk){
        super(vk);
    }

    @Override
    public VkPhysicalDevicePointClippingProperties getVk(){
        return (VkPhysicalDevicePointClippingProperties) super.getVk();
    }

    public VulkanPhysicalDevicePointClippingProperties(VulkanStructureType sType, VulkanObject pNext, VulkanPointClippingBehavior pointClippingBehavior) {
        super(new VkPhysicalDevicePointClippingProperties(sType.getVk(), pNext.getVk(), pointClippingBehavior.getVk()));
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

    public VulkanPointClippingBehavior getPointClippingBehavior() {
        return new VulkanPointClippingBehavior(getVk().getPointClippingBehavior());
    }

    public void setPointClippingBehavior(VulkanPointClippingBehavior pointClippingBehavior) {
        getVk().setPointClippingBehavior(pointClippingBehavior.getVk());
    }


    public static class Array extends VulkanPhysicalDevicePointClippingProperties implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDevicePointClippingProperties> {
        public Array(VkPhysicalDevicePointClippingProperties.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPhysicalDevicePointClippingProperties.Array(count));
        }

        public Array(int count, VulkanPhysicalDevicePointClippingProperties o){
            this(new VkPhysicalDevicePointClippingProperties.Array(count, o.getVk()));
        }

        @Override
        public VkPhysicalDevicePointClippingProperties.Array getVk(){
            return (VkPhysicalDevicePointClippingProperties.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPhysicalDevicePointClippingProperties get(int i){
            return new VulkanPhysicalDevicePointClippingProperties(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPhysicalDevicePointClippingProperties.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPhysicalDevicePointClippingProperties.Pointer());
        }

        public Pointer(long value) {
            this(new VkPhysicalDevicePointClippingProperties.Pointer(value));
        }

        @Override
        public VkPhysicalDevicePointClippingProperties.Pointer getVk(){
            return (VkPhysicalDevicePointClippingProperties.Pointer) super.getVk();
        }

        public static class Array extends VulkanPhysicalDevicePointClippingProperties.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDevicePointClippingProperties.Pointer> {
            public Array(int count) {
                super(new VkPhysicalDevicePointClippingProperties.Pointer.Array(count));
            }

            public Array(VulkanPhysicalDevicePointClippingProperties[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPhysicalDevicePointClippingProperties.Pointer.Array getVk(){
                return (VkPhysicalDevicePointClippingProperties.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPhysicalDevicePointClippingProperties.Pointer get(int i){
                return new VulkanPhysicalDevicePointClippingProperties.Pointer(getVk().get(i));
            }
        }
    }
}
