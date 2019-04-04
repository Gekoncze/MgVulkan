package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDebugUtilsObjectNameInfoEXT.html">khronos documentation</a>
 **/
public class VulkanDebugUtilsObjectNameInfoEXT extends VulkanObject {
    public VulkanDebugUtilsObjectNameInfoEXT(){
        super(new VkDebugUtilsObjectNameInfoEXT());
    }

    public VulkanDebugUtilsObjectNameInfoEXT(VkDebugUtilsObjectNameInfoEXT vk){
        super(vk);
    }

    @Override
    public VkDebugUtilsObjectNameInfoEXT getVk(){
        return (VkDebugUtilsObjectNameInfoEXT) super.getVk();
    }
    public VulkanDebugUtilsObjectNameInfoEXT(VulkanObject pNext, VulkanObjectType objectType, VulkanUInt64 objectHandle, VulkanChar pObjectName) {
        super(new VkDebugUtilsObjectNameInfoEXT(pNext.getVk(), objectType.getVk(), objectHandle.getVk(), pObjectName.getVk()));
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

    public VulkanObjectType getObjectType() {
        return new VulkanObjectType(getVk().getObjectType());
    }

    public void setObjectType(VulkanObjectType objectType) {
        getVk().setObjectType(objectType.getVk());
    }

    public VulkanUInt64 getObjectHandle() {
        return new VulkanUInt64(getVk().getObjectHandle());
    }

    public void setObjectHandle(VulkanUInt64 objectHandle) {
        getVk().setObjectHandle(objectHandle.getVk());
    }

    public VulkanChar getPObjectName() {
        return new VulkanChar(getVk().getPObjectName());
    }

    public void setPObjectName(VulkanChar pObjectName) {
        getVk().setPObjectName(pObjectName.getVk());
    }


    public static class Array extends VulkanDebugUtilsObjectNameInfoEXT implements cz.mg.collections.array.ReadonlyArray<VulkanDebugUtilsObjectNameInfoEXT> {
        public Array(VkDebugUtilsObjectNameInfoEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDebugUtilsObjectNameInfoEXT.Array(count));
        }

        public Array(int count, VulkanDebugUtilsObjectNameInfoEXT o){
            this(new VkDebugUtilsObjectNameInfoEXT.Array(count, o.getVk()));
        }

        @Override
        public VkDebugUtilsObjectNameInfoEXT.Array getVk(){
            return (VkDebugUtilsObjectNameInfoEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDebugUtilsObjectNameInfoEXT get(int i){
            return new VulkanDebugUtilsObjectNameInfoEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDebugUtilsObjectNameInfoEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDebugUtilsObjectNameInfoEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkDebugUtilsObjectNameInfoEXT.Pointer(value));
        }

        @Override
        public VkDebugUtilsObjectNameInfoEXT.Pointer getVk(){
            return (VkDebugUtilsObjectNameInfoEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanDebugUtilsObjectNameInfoEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDebugUtilsObjectNameInfoEXT.Pointer> {
            public Array(int count) {
                super(new VkDebugUtilsObjectNameInfoEXT.Pointer.Array(count));
            }

            public Array(VulkanDebugUtilsObjectNameInfoEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDebugUtilsObjectNameInfoEXT.Pointer.Array getVk(){
                return (VkDebugUtilsObjectNameInfoEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDebugUtilsObjectNameInfoEXT.Pointer get(int i){
                return new VulkanDebugUtilsObjectNameInfoEXT.Pointer(getVk().get(i));
            }
        }
    }
}
