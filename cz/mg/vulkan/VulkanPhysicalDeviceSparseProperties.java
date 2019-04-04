package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPhysicalDeviceSparseProperties.html">khronos documentation</a>
 **/
public class VulkanPhysicalDeviceSparseProperties extends VulkanObject {
    public VulkanPhysicalDeviceSparseProperties(){
        super(new VkPhysicalDeviceSparseProperties());
    }

    public VulkanPhysicalDeviceSparseProperties(VkPhysicalDeviceSparseProperties vk){
        super(vk);
    }

    @Override
    public VkPhysicalDeviceSparseProperties getVk(){
        return (VkPhysicalDeviceSparseProperties) super.getVk();
    }

    public VulkanPhysicalDeviceSparseProperties(VulkanBool32 residencyStandard2DBlockShape, VulkanBool32 residencyStandard2DMultisampleBlockShape, VulkanBool32 residencyStandard3DBlockShape, VulkanBool32 residencyAlignedMipSize, VulkanBool32 residencyNonResidentStrict) {
        super(new VkPhysicalDeviceSparseProperties(residencyStandard2DBlockShape.getVk(), residencyStandard2DMultisampleBlockShape.getVk(), residencyStandard3DBlockShape.getVk(), residencyAlignedMipSize.getVk(), residencyNonResidentStrict.getVk()));
    }

    public VulkanBool32 getResidencyStandard2DBlockShape() {
        return new VulkanBool32(getVk().getResidencyStandard2DBlockShape());
    }

    public void setResidencyStandard2DBlockShape(VulkanBool32 residencyStandard2DBlockShape) {
        getVk().setResidencyStandard2DBlockShape(residencyStandard2DBlockShape.getVk());
    }

    public VulkanBool32 getResidencyStandard2DMultisampleBlockShape() {
        return new VulkanBool32(getVk().getResidencyStandard2DMultisampleBlockShape());
    }

    public void setResidencyStandard2DMultisampleBlockShape(VulkanBool32 residencyStandard2DMultisampleBlockShape) {
        getVk().setResidencyStandard2DMultisampleBlockShape(residencyStandard2DMultisampleBlockShape.getVk());
    }

    public VulkanBool32 getResidencyStandard3DBlockShape() {
        return new VulkanBool32(getVk().getResidencyStandard3DBlockShape());
    }

    public void setResidencyStandard3DBlockShape(VulkanBool32 residencyStandard3DBlockShape) {
        getVk().setResidencyStandard3DBlockShape(residencyStandard3DBlockShape.getVk());
    }

    public VulkanBool32 getResidencyAlignedMipSize() {
        return new VulkanBool32(getVk().getResidencyAlignedMipSize());
    }

    public void setResidencyAlignedMipSize(VulkanBool32 residencyAlignedMipSize) {
        getVk().setResidencyAlignedMipSize(residencyAlignedMipSize.getVk());
    }

    public VulkanBool32 getResidencyNonResidentStrict() {
        return new VulkanBool32(getVk().getResidencyNonResidentStrict());
    }

    public void setResidencyNonResidentStrict(VulkanBool32 residencyNonResidentStrict) {
        getVk().setResidencyNonResidentStrict(residencyNonResidentStrict.getVk());
    }


    public static class Array extends VulkanPhysicalDeviceSparseProperties implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceSparseProperties> {
        public Array(VkPhysicalDeviceSparseProperties.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPhysicalDeviceSparseProperties.Array(count));
        }

        public Array(int count, VulkanPhysicalDeviceSparseProperties o){
            this(new VkPhysicalDeviceSparseProperties.Array(count, o.getVk()));
        }

        @Override
        public VkPhysicalDeviceSparseProperties.Array getVk(){
            return (VkPhysicalDeviceSparseProperties.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPhysicalDeviceSparseProperties get(int i){
            return new VulkanPhysicalDeviceSparseProperties(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPhysicalDeviceSparseProperties.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPhysicalDeviceSparseProperties.Pointer());
        }

        public Pointer(long value) {
            this(new VkPhysicalDeviceSparseProperties.Pointer(value));
        }

        @Override
        public VkPhysicalDeviceSparseProperties.Pointer getVk(){
            return (VkPhysicalDeviceSparseProperties.Pointer) super.getVk();
        }

        public static class Array extends VulkanPhysicalDeviceSparseProperties.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceSparseProperties.Pointer> {
            public Array(int count) {
                super(new VkPhysicalDeviceSparseProperties.Pointer.Array(count));
            }

            public Array(VulkanPhysicalDeviceSparseProperties[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPhysicalDeviceSparseProperties.Pointer.Array getVk(){
                return (VkPhysicalDeviceSparseProperties.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPhysicalDeviceSparseProperties.Pointer get(int i){
                return new VulkanPhysicalDeviceSparseProperties.Pointer(getVk().get(i));
            }
        }
    }
}
