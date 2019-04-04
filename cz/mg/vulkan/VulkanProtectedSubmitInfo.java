package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkProtectedSubmitInfo.html">khronos documentation</a>
 **/
public class VulkanProtectedSubmitInfo extends VulkanObject {
    public VulkanProtectedSubmitInfo(){
        super(new VkProtectedSubmitInfo());
    }

    public VulkanProtectedSubmitInfo(VkProtectedSubmitInfo vk){
        super(vk);
    }

    @Override
    public VkProtectedSubmitInfo getVk(){
        return (VkProtectedSubmitInfo) super.getVk();
    }
    public VulkanProtectedSubmitInfo(VulkanObject pNext, VulkanBool32 protectedSubmit) {
        super(new VkProtectedSubmitInfo(pNext.getVk(), protectedSubmit.getVk()));
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

    public VulkanBool32 getProtectedSubmit() {
        return new VulkanBool32(getVk().getProtectedSubmit());
    }

    public void setProtectedSubmit(VulkanBool32 protectedSubmit) {
        getVk().setProtectedSubmit(protectedSubmit.getVk());
    }


    public static class Array extends VulkanProtectedSubmitInfo implements cz.mg.collections.array.ReadonlyArray<VulkanProtectedSubmitInfo> {
        public Array(VkProtectedSubmitInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkProtectedSubmitInfo.Array(count));
        }

        public Array(int count, VulkanProtectedSubmitInfo o){
            this(new VkProtectedSubmitInfo.Array(count, o.getVk()));
        }

        @Override
        public VkProtectedSubmitInfo.Array getVk(){
            return (VkProtectedSubmitInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanProtectedSubmitInfo get(int i){
            return new VulkanProtectedSubmitInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkProtectedSubmitInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkProtectedSubmitInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkProtectedSubmitInfo.Pointer(value));
        }

        @Override
        public VkProtectedSubmitInfo.Pointer getVk(){
            return (VkProtectedSubmitInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanProtectedSubmitInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanProtectedSubmitInfo.Pointer> {
            public Array(int count) {
                super(new VkProtectedSubmitInfo.Pointer.Array(count));
            }

            public Array(VulkanProtectedSubmitInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkProtectedSubmitInfo.Pointer.Array getVk(){
                return (VkProtectedSubmitInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanProtectedSubmitInfo.Pointer get(int i){
                return new VulkanProtectedSubmitInfo.Pointer(getVk().get(i));
            }
        }
    }
}
