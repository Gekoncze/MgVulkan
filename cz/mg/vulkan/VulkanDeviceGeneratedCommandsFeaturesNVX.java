package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDeviceGeneratedCommandsFeaturesNVX.html">khronos documentation</a>
 **/
public class VulkanDeviceGeneratedCommandsFeaturesNVX extends VulkanObject {
    public VulkanDeviceGeneratedCommandsFeaturesNVX(){
        super(new VkDeviceGeneratedCommandsFeaturesNVX());
    }

    public VulkanDeviceGeneratedCommandsFeaturesNVX(VkDeviceGeneratedCommandsFeaturesNVX vk){
        super(vk);
    }

    @Override
    public VkDeviceGeneratedCommandsFeaturesNVX getVk(){
        return (VkDeviceGeneratedCommandsFeaturesNVX) super.getVk();
    }

    public VulkanDeviceGeneratedCommandsFeaturesNVX(VulkanStructureType sType, VulkanObject pNext, VulkanBool32 computeBindingPointSupport) {
        super(new VkDeviceGeneratedCommandsFeaturesNVX(sType.getVk(), pNext.getVk(), computeBindingPointSupport.getVk()));
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

    public VulkanBool32 getComputeBindingPointSupport() {
        return new VulkanBool32(getVk().getComputeBindingPointSupport());
    }

    public void setComputeBindingPointSupport(VulkanBool32 computeBindingPointSupport) {
        getVk().setComputeBindingPointSupport(computeBindingPointSupport.getVk());
    }


    public static class Array extends VulkanDeviceGeneratedCommandsFeaturesNVX implements cz.mg.collections.array.ReadonlyArray<VulkanDeviceGeneratedCommandsFeaturesNVX> {
        public Array(VkDeviceGeneratedCommandsFeaturesNVX.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDeviceGeneratedCommandsFeaturesNVX.Array(count));
        }

        public Array(int count, VulkanDeviceGeneratedCommandsFeaturesNVX o){
            this(new VkDeviceGeneratedCommandsFeaturesNVX.Array(count, o.getVk()));
        }

        @Override
        public VkDeviceGeneratedCommandsFeaturesNVX.Array getVk(){
            return (VkDeviceGeneratedCommandsFeaturesNVX.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDeviceGeneratedCommandsFeaturesNVX get(int i){
            return new VulkanDeviceGeneratedCommandsFeaturesNVX(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDeviceGeneratedCommandsFeaturesNVX.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDeviceGeneratedCommandsFeaturesNVX.Pointer());
        }

        public Pointer(long value) {
            this(new VkDeviceGeneratedCommandsFeaturesNVX.Pointer(value));
        }

        @Override
        public VkDeviceGeneratedCommandsFeaturesNVX.Pointer getVk(){
            return (VkDeviceGeneratedCommandsFeaturesNVX.Pointer) super.getVk();
        }

        public static class Array extends VulkanDeviceGeneratedCommandsFeaturesNVX.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDeviceGeneratedCommandsFeaturesNVX.Pointer> {
            public Array(int count) {
                super(new VkDeviceGeneratedCommandsFeaturesNVX.Pointer.Array(count));
            }

            public Array(VulkanDeviceGeneratedCommandsFeaturesNVX[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDeviceGeneratedCommandsFeaturesNVX.Pointer.Array getVk(){
                return (VkDeviceGeneratedCommandsFeaturesNVX.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDeviceGeneratedCommandsFeaturesNVX.Pointer get(int i){
                return new VulkanDeviceGeneratedCommandsFeaturesNVX.Pointer(getVk().get(i));
            }
        }
    }
}
