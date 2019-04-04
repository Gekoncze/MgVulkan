package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.html">khronos documentation</a>
 **/
public class VulkanPhysicalDeviceVertexAttributeDivisorPropertiesEXT extends VulkanObject {
    public VulkanPhysicalDeviceVertexAttributeDivisorPropertiesEXT(){
        super(new VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT());
    }

    public VulkanPhysicalDeviceVertexAttributeDivisorPropertiesEXT(VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT vk){
        super(vk);
    }

    @Override
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT getVk(){
        return (VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT) super.getVk();
    }

    public VulkanPhysicalDeviceVertexAttributeDivisorPropertiesEXT(VulkanStructureType sType, VulkanObject pNext, VulkanUInt32 maxVertexAttribDivisor) {
        super(new VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT(sType.getVk(), pNext.getVk(), maxVertexAttribDivisor.getVk()));
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

    public VulkanUInt32 getMaxVertexAttribDivisor() {
        return new VulkanUInt32(getVk().getMaxVertexAttribDivisor());
    }

    public void setMaxVertexAttribDivisor(VulkanUInt32 maxVertexAttribDivisor) {
        getVk().setMaxVertexAttribDivisor(maxVertexAttribDivisor.getVk());
    }


    public static class Array extends VulkanPhysicalDeviceVertexAttributeDivisorPropertiesEXT implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceVertexAttributeDivisorPropertiesEXT> {
        public Array(VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.Array(count));
        }

        public Array(int count, VulkanPhysicalDeviceVertexAttributeDivisorPropertiesEXT o){
            this(new VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.Array(count, o.getVk()));
        }

        @Override
        public VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.Array getVk(){
            return (VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPhysicalDeviceVertexAttributeDivisorPropertiesEXT get(int i){
            return new VulkanPhysicalDeviceVertexAttributeDivisorPropertiesEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.Pointer(value));
        }

        @Override
        public VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.Pointer getVk(){
            return (VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanPhysicalDeviceVertexAttributeDivisorPropertiesEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPhysicalDeviceVertexAttributeDivisorPropertiesEXT.Pointer> {
            public Array(int count) {
                super(new VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.Pointer.Array(count));
            }

            public Array(VulkanPhysicalDeviceVertexAttributeDivisorPropertiesEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.Pointer.Array getVk(){
                return (VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPhysicalDeviceVertexAttributeDivisorPropertiesEXT.Pointer get(int i){
                return new VulkanPhysicalDeviceVertexAttributeDivisorPropertiesEXT.Pointer(getVk().get(i));
            }
        }
    }
}
