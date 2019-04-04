package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPhysicalDeviceVariablePointerFeatures.html">khronos documentation</a>
 **/
public class VulkanPhysicalDeviceVariablePointerFeatures extends VulkanObject {
    public VulkanPhysicalDeviceVariablePointerFeatures(){
        super(new VkPhysicalDeviceVariablePointerFeatures());
    }

    public VulkanPhysicalDeviceVariablePointerFeatures(VkPhysicalDeviceVariablePointerFeatures vk){
        super(vk);
    }

    @Override
    public VkPhysicalDeviceVariablePointerFeatures getVk(){
        return (VkPhysicalDeviceVariablePointerFeatures) super.getVk();
    }

    public VulkanPhysicalDeviceVariablePointerFeatures(VulkanStructureType sType, VulkanObject pNext, VulkanBool32 variablePointersStorageBuffer, VulkanBool32 variablePointers) {
        super(new VkPhysicalDeviceVariablePointerFeatures(sType.getVk(), pNext.getVk(), variablePointersStorageBuffer.getVk(), variablePointers.getVk()));
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

    public VulkanBool32 getVariablePointersStorageBuffer() {
        return new VulkanBool32(getVk().getVariablePointersStorageBuffer());
    }

    public void setVariablePointersStorageBuffer(VulkanBool32 variablePointersStorageBuffer) {
        getVk().setVariablePointersStorageBuffer(variablePointersStorageBuffer.getVk());
    }

    public VulkanBool32 getVariablePointers() {
        return new VulkanBool32(getVk().getVariablePointers());
    }

    public void setVariablePointers(VulkanBool32 variablePointers) {
        getVk().setVariablePointers(variablePointers.getVk());
    }


    public static class Array extends VulkanPhysicalDeviceVariablePointerFeatures implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceVariablePointerFeatures> {
        public Array(VkPhysicalDeviceVariablePointerFeatures.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPhysicalDeviceVariablePointerFeatures.Array(count));
        }

        public Array(int count, VulkanPhysicalDeviceVariablePointerFeatures o){
            this(new VkPhysicalDeviceVariablePointerFeatures.Array(count, o.getVk()));
        }

        @Override
        public VkPhysicalDeviceVariablePointerFeatures.Array getVk(){
            return (VkPhysicalDeviceVariablePointerFeatures.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPhysicalDeviceVariablePointerFeatures get(int i){
            return new VulkanPhysicalDeviceVariablePointerFeatures(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPhysicalDeviceVariablePointerFeatures.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPhysicalDeviceVariablePointerFeatures.Pointer());
        }

        public Pointer(long value) {
            this(new VkPhysicalDeviceVariablePointerFeatures.Pointer(value));
        }

        @Override
        public VkPhysicalDeviceVariablePointerFeatures.Pointer getVk(){
            return (VkPhysicalDeviceVariablePointerFeatures.Pointer) super.getVk();
        }

        public static class Array extends VulkanPhysicalDeviceVariablePointerFeatures.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceVariablePointerFeatures.Pointer> {
            public Array(int count) {
                super(new VkPhysicalDeviceVariablePointerFeatures.Pointer.Array(count));
            }

            public Array(VulkanPhysicalDeviceVariablePointerFeatures[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPhysicalDeviceVariablePointerFeatures.Pointer.Array getVk(){
                return (VkPhysicalDeviceVariablePointerFeatures.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPhysicalDeviceVariablePointerFeatures.Pointer get(int i){
                return new VulkanPhysicalDeviceVariablePointerFeatures.Pointer(getVk().get(i));
            }
        }
    }
}
