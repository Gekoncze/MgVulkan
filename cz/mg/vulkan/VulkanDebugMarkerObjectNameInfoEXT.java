package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDebugMarkerObjectNameInfoEXT.html">khronos documentation</a>
 **/
public class VulkanDebugMarkerObjectNameInfoEXT extends VulkanObject {
    public VulkanDebugMarkerObjectNameInfoEXT(){
        super(new VkDebugMarkerObjectNameInfoEXT());
    }

    public VulkanDebugMarkerObjectNameInfoEXT(VkDebugMarkerObjectNameInfoEXT vk){
        super(vk);
    }

    @Override
    public VkDebugMarkerObjectNameInfoEXT getVk(){
        return (VkDebugMarkerObjectNameInfoEXT) super.getVk();
    }
    public VulkanDebugMarkerObjectNameInfoEXT(VulkanObject pNext, VulkanDebugReportObjectTypeEXT objectType, VulkanUInt64 object, VulkanChar pObjectName) {
        super(new VkDebugMarkerObjectNameInfoEXT(pNext.getVk(), objectType.getVk(), object.getVk(), pObjectName.getVk()));
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

    public VulkanDebugReportObjectTypeEXT getObjectType() {
        return new VulkanDebugReportObjectTypeEXT(getVk().getObjectType());
    }

    public void setObjectType(VulkanDebugReportObjectTypeEXT objectType) {
        getVk().setObjectType(objectType.getVk());
    }

    public VulkanUInt64 getObject() {
        return new VulkanUInt64(getVk().getObject());
    }

    public void setObject(VulkanUInt64 object) {
        getVk().setObject(object.getVk());
    }

    public VulkanChar getPObjectName() {
        return new VulkanChar(getVk().getPObjectName());
    }

    public void setPObjectName(VulkanChar pObjectName) {
        getVk().setPObjectName(pObjectName.getVk());
    }


    public static class Array extends VulkanDebugMarkerObjectNameInfoEXT implements cz.mg.collections.array.ReadonlyArray<VulkanDebugMarkerObjectNameInfoEXT> {
        public Array(VkDebugMarkerObjectNameInfoEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDebugMarkerObjectNameInfoEXT.Array(count));
        }

        public Array(int count, VulkanDebugMarkerObjectNameInfoEXT o){
            this(new VkDebugMarkerObjectNameInfoEXT.Array(count, o.getVk()));
        }

        @Override
        public VkDebugMarkerObjectNameInfoEXT.Array getVk(){
            return (VkDebugMarkerObjectNameInfoEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDebugMarkerObjectNameInfoEXT get(int i){
            return new VulkanDebugMarkerObjectNameInfoEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDebugMarkerObjectNameInfoEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDebugMarkerObjectNameInfoEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkDebugMarkerObjectNameInfoEXT.Pointer(value));
        }

        @Override
        public VkDebugMarkerObjectNameInfoEXT.Pointer getVk(){
            return (VkDebugMarkerObjectNameInfoEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanDebugMarkerObjectNameInfoEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDebugMarkerObjectNameInfoEXT.Pointer> {
            public Array(int count) {
                super(new VkDebugMarkerObjectNameInfoEXT.Pointer.Array(count));
            }

            public Array(VulkanDebugMarkerObjectNameInfoEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDebugMarkerObjectNameInfoEXT.Pointer.Array getVk(){
                return (VkDebugMarkerObjectNameInfoEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDebugMarkerObjectNameInfoEXT.Pointer get(int i){
                return new VulkanDebugMarkerObjectNameInfoEXT.Pointer(getVk().get(i));
            }
        }
    }
}
